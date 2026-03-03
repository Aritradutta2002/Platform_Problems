---
description: Load these instructions when generating Java problem scaffolds from only a problem filename, or when preparing competitive-programming templates in this repository.
# applyTo: '*.java'
---
Provide project context and coding guidelines that AI should follow when generating code, answering questions, or reviewing changes.

## Repository Context
- This repository stores platform problem solutions and practice scaffolds under `src/`.
- Supported platforms for scaffold generation:
  - `src/LeetCode`
  - `src/Codeforces`
  - `src/CodeChef`

## Problem-Name-Only Workflow
- When the user sends only a Java filename (example: `MinimumPartitionScore3826.java`):
  - Identify platform from user input.
  - If platform is missing, ask: `Which platform: LeetCode, Codeforces, or CodeChef?`
  - Create or overwrite file in the correct folder:
    - LeetCode -> `src/LeetCode/<filename>`
    - Codeforces -> `src/Codeforces/<filename>`
    - CodeChef -> `src/CodeChef/<filename>`

## Java Scaffold Rules (No Solution)
- Use package matching folder name:
  - `package LeetCode;`
  - `package Codeforces;`
  - `package CodeChef;`
- Class name must exactly match filename without `.java`.
- Add correct method signature for the target problem.
- Do not implement algorithm.
- Method body must throw:
  - `throw new UnsupportedOperationException("Not implemented yet.");`

## Required Template Content
- Add a clear problem block comment with:
  - problem title
  - short description
  - constraints
  - input/output format (mandatory for Codeforces/CodeChef)
- Add runnable `main` and test harness:
  - official sample tests with expected outputs
  - 2-3 extra sanity tests
  - PASS/FAIL style output
  - if method is unimplemented, print `SKIPPED` instead of crashing

## Response Behavior
- Do not provide hints, algorithm explanation, or full solution unless user explicitly asks.
- Compile and run once after scaffold creation.
- Report:
  - file path
  - compile status
  - run summary
- If statement or samples are missing, ask user for problem link.
