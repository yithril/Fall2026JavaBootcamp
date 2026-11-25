# GitHub Copilot custom agent cheat sheet

These examples are for the **Copilot harness in VS Code**. Custom agents are
reusable roles: the YAML header configures the agent, and the Markdown below it
tells the agent what to do. Other harnesses and Copilot on GitHub can support
different fields, tools, and behavior.

## Try the examples

1. Open the `AgenticExamples` folder as your VS Code workspace, sign in to
   GitHub Copilot, and select the **Copilot** harness in chat.
2. Select an agent from the **Agent** dropdown. If you do not see it, open
   **Chat: Open Customizations** from the Command Palette and check the
   **Agents** tab for errors.
3. Give it a task, such as one of these:

   | Agent | Example request |
   | --- | --- |
   | [Java Tutor](.github/agents/java-tutor.agent.md) | Explain the difference between an interface and an abstract class. |
   | [Java Reviewer](.github/agents/java-reviewer.agent.md) | Review my `BankAccount` class for bugs. |
   | [Java Builder](.github/agents/java-builder.agent.md) | Add input validation to my `BankAccount` constructor. |
   | [Java Test Writer](.github/agents/java-test-writer.agent.md) | Add tests for deposits and withdrawals. |

4. Review the agent's response, tool activity, and any changes. Agents can make
   mistakes; check their work before accepting it.

If you open a different project folder, copy the desired `.agent.md` files into
that workspace's `.github/agents` folder. Opening the repository root instead
of `AgenticExamples` does not automatically make these nested examples
repository-wide agents.

## File format

Create `.github/agents/my-agent.agent.md` inside the workspace:

```markdown
---
name: My Agent
description: Explains what this agent does.
tools: ['read', 'search']
---

Tell the agent what task to perform, any boundaries, and the expected output.
```

The lines between `---` markers are **YAML frontmatter**. The instructions
below the second marker are ordinary Markdown. Indentation matters for YAML.

## Common header fields

| Field | Example value | Meaning |
| --- | --- | --- |
| `name` | `Java Reviewer` | Name shown in the agent picker. |
| `description` | `Reviews Java code for bugs.` | What the agent does; required for the Copilot schema. |
| `tools` | `['read', 'search']` | Tools available to the agent; see the table below. |
| `model` | `gpt-5.3-codex` | Preferred model ID, if available to your account. |
| `reasoning-effort` | `high` | Initial thinking effort, if supported by that model. |
| `model-policy` | `preferred` or `required` | Whether the selected agent's model is a preference or a restriction. |
| `user-invocable` | `true` or `false` | Whether the agent appears in the agent picker. |
| `disable-model-invocation` | `true` or `false` | Whether other agents are prevented from invoking it. |
| `target` | `github-copilot` or `vscode` | Selects Copilot or Local schema validation in the editor; does not switch the session harness. |

Except for `description`, these fields are optional for the Copilot schema.
The examples leave out `model` and `reasoning-effort` so students can use their
own selected model and settings.

### Models and reasoning effort

To try a concrete model and effort, add these lines to the header:

```yaml
model: gpt-5.3-codex
reasoning-effort: high
```

`gpt-5.3-codex` is an example Copilot runtime model ID, not a guarantee that
every student has access to it. Model availability depends on the account,
plan, organization settings, and harness. The effort values available also
depend on the model; `high` is one example, not a value every model supports.
Higher effort can use more AI credits.

For current values, select the Copilot harness, open an `.agent.md` file, and
use VS Code's autocomplete and hover information on `model` and
`reasoning-effort`. The model picker also shows the models and thinking options
available to you. Omit these fields if you do not need to choose them. Test the
agent in your actual session: editor suggestions alone do not guarantee runtime
availability.

An ordered list can offer alternatives:

```yaml
model: ['gpt-5.3-codex', 'claude-haiku-4.5']
model-policy: preferred
```

The first available model is preferred; both IDs are examples and must be
available in the student's setup. With `required`, sending is blocked if none
of the listed models are available. The model policy restricts model choices,
not the thinking effort.

## Copilot tool aliases

These are built-in aliases for the Copilot harness. Actual availability can
depend on the session. Give an agent only the tools its job needs.

| Value | What it enables |
| --- | --- |
| `read` | Read files. |
| `search` | Find files and search their contents. |
| `edit` | Create or modify files. |
| `execute` | Run commands in a shell. |
| `web` | Fetch web pages or search the web, when available. |
| `agent` | Delegate work to another agent. |
| `todo` | Create and manage a task list. |
| `*` | All available tools. |

Examples:

```yaml
tools: ['read', 'search']                    # Review or explain code
tools: ['read', 'search', 'edit', 'execute'] # Implement and test
tools: []                                    # No tools
tools: ['*']                                 # All available tools
```

Omitting `tools` makes all available tools accessible in Copilot; an empty
list is different. Extension and MCP server tools use qualified names such
as `server-name/tool-name` or `server-name/*`, but only if that server is
configured and available. Use editor autocomplete to find names in your
setup; do not assume everyone has the same extensions or MCP servers.

Instructions such as "do not edit files" guide behavior but are not a security
boundary. Tool restrictions and available permissions vary by harness. Review
tool activity and approvals, especially for agents that can edit or run commands.

## Learn more

- [VS Code custom agent file reference](https://code.visualstudio.com/docs/agents/reference/custom-agent-file-reference)
- [Create and use custom agents in VS Code](https://code.visualstudio.com/docs/agent-customization/custom-agents)
- [GitHub custom agents configuration and tool aliases](https://docs.github.com/en/copilot/reference/custom-agents-configuration)
- [VS Code language models and thinking effort](https://code.visualstudio.com/docs/agent-customization/language-models)
