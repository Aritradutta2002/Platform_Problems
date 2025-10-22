# Platform_Problems

This repository collects competitive programming solutions (AtCoder, CodeChef, CodeForces, CSES, LeetCode) under a single `src/` tree. The layout is currently non-standard for Maven/Gradle Java projects (sources live under `src/` rather than `src/main/java`).

What I added

- `pom.xml` — Minimal Maven project allowing compile and test runs. Assumes Java 17. Tests use JUnit 5.
- `.gitignore` — Expanded to include common IDE/build artifacts.

How to build

From a PowerShell terminal on Windows (this repo root):

```powershell
mvn -v
mvn -DskipTests package
```

How to run tests

```powershell
mvn test
```

Notes & next steps

- The current `pom.xml` uses the non-standard `src/` locations. For long-term maintainability, consider moving sources to the Maven standard layout:
  - `src/main/java/...` for production code
  - `src/test/java/...` for tests
- If your code requires a specific Java version, update the `maven.compiler.source` and `target` properties inside `pom.xml`.
- I intentionally kept changes minimal to avoid touching source files.

If you'd like, I can:

- Convert the repository to standard Maven layout automatically and update package declarations if needed.
- Add a small runner or scripts for quick execution of single problem files.
- Configure GitHub Actions for CI (build + tests).
