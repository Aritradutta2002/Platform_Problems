# Contributing to Platform Problems

Thank you for considering contributing to this project! 🎉

## How to Contribute

### Reporting Bugs

If you find a bug, please create an issue with:
- A clear description of the problem
- Steps to reproduce
- Expected vs actual behavior
- Java version and OS details

### Adding New Solutions

1. **Fork the repository**
2. **Create a feature branch:**
   ```bash
   git checkout -b feature/platform-problem-name
   ```

3. **Add your solution:**
   - Place solutions in the appropriate platform folder
   - Follow the naming convention: `ProblemName.java`
   - Include the problem URL in comments

4. **Write tests:**
   - Add test cases in the corresponding `_TestCases` folder
   - Name tests as `ProblemNameTest.java`
   - Include multiple test cases

5. **Ensure code quality:**
   ```bash
   mvn clean compile
   mvn test
   ```

6. **Commit your changes:**
   ```bash
   git commit -m "Add solution for [Platform] - [Problem Name]"
   ```

7. **Push and create a Pull Request:**
   ```bash
   git push origin feature/platform-problem-name
   ```

## Code Style Guidelines

### Java Conventions
- Use meaningful variable names
- Follow Java naming conventions (camelCase for variables, PascalCase for classes)
- Include comments for complex logic
- Keep methods short and focused

### Solution Template
```java
package PlatformName.PlatformName_Problems;

import java.util.*;

/**
 * Problem: [Problem Name]
 * URL: [Problem URL]
 * Difficulty: [Easy/Medium/Hard]
 * 
 * Description:
 * [Brief problem description]
 */
public class ProblemName {
    public static void main(String[] args) {
        // Your solution here
    }
}
```

### Test Template
```java
package PlatformName.PlatformName_TestCases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProblemNameTest {
    @Test
    void testCase1() {
        // Test implementation
    }
}
```

## Pull Request Process

1. Update README.md if adding a new platform or significant feature
2. Ensure all tests pass
3. Update documentation if needed
4. Request review from maintainers

## Code of Conduct

- Be respectful and inclusive
- Focus on constructive feedback
- Help others learn and grow

## Questions?

Feel free to open an issue for any questions or suggestions!

---

Thank you for contributing! 🚀
