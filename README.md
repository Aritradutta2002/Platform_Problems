# 🚀 Platform Problems

[![Java CI](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)]()

> A comprehensive collection of competitive programming solutions from multiple platforms including AtCoder, CodeChef, CodeForces, CSES, and LeetCode.

## 📋 Table of Contents

- [About](#about)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Building the Project](#building-the-project)
- [Running Tests](#running-tests)
- [Supported Platforms](#supported-platforms)
- [Contributing](#contributing)
- [License](#license)

## 🎯 About

This repository contains my solutions to competitive programming problems from various platforms. Each solution is written in Java 17 and includes unit tests using JUnit 5.

**Key Features:**
- ✅ Solutions from 5+ competitive programming platforms
- ✅ Unit tests for verification
- ✅ Maven build system for easy compilation
- ✅ Clean, readable code with proper documentation
- ✅ CI/CD ready with GitHub Actions

## 📁 Project Structure

```
Platform_Problems/
├── src/
│   ├── AtCoder/
│   │   ├── AtCoder_Problems/    # AtCoder problem solutions
│   │   └── AtCoder_TestCases/   # AtCoder test cases
│   ├── CodeChef/
│   │   ├── CodeChef_Problems/   # CodeChef problem solutions
│   │   └── CodeChef_TestCases/  # CodeChef test cases
│   ├── CodeForces/
│   │   ├── CodeForces_Problems/ # CodeForces problem solutions
│   │   └── CodeForces_TestCases/# CodeForces test cases
│   ├── CSES/
│   │   ├── CSES_Problems/       # CSES problem solutions
│   │   └── CSES_TestCases/      # CSES test cases
│   ├── LeetCode/
│   │   ├── LeetCode_Problems/   # LeetCode problem solutions
│   │   └── LeetCode_TestCases/  # LeetCode test cases
│   └── Contests/                # Contest-specific solutions
├── lib/                         # External libraries (if needed)
├── pom.xml                      # Maven configuration
└── README.md                    # This file
```

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK) 17** or higher
- **Apache Maven 3.6+**
- **Git** (for cloning the repository)

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/YOUR_USERNAME/Platform_Problems.git
   cd Platform_Problems
   ```

2. **Verify Maven installation:**
   ```bash
   mvn -v
   ```

3. **Install dependencies:**
   ```bash
   mvn clean install
   ```

## 🔨 Building the Project

### Compile without running tests:
```bash
mvn clean compile
```

### Compile and package:
```bash
mvn clean package -DskipTests
```

### Full build with tests:
```bash
mvn clean install
```

## 🧪 Running Tests

### Run all tests:
```bash
mvn test
```

### Run tests for a specific platform:
```bash
mvn test -Dtest="*AtCoder*"
mvn test -Dtest="*LeetCode*"
```

### Run with verbose output:
```bash
mvn test -X
```

## 🏆 Supported Platforms

| Platform | Problems Solved | Test Coverage |
|----------|----------------|---------------|
| [AtCoder](https://atcoder.jp/) | ✅ Multiple | ✅ Yes |
| [CodeChef](https://www.codechef.com/) | ✅ Multiple | ✅ Yes |
| [CodeForces](https://codeforces.com/) | ✅ Multiple | ✅ Yes |
| [CSES](https://cses.fi/) | ✅ Multiple | ✅ Yes |
| [LeetCode](https://leetcode.com/) | ✅ Multiple | ✅ Yes |

## 🤝 Contributing

Contributions are welcome! If you'd like to add solutions or improve existing ones:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-solution`)
3. Commit your changes (`git commit -m 'Add solution for Problem X'`)
4. Push to the branch (`git push origin feature/new-solution`)
5. Open a Pull Request

## 📝 Code Style

- Follow Java naming conventions
- Include comments for complex logic
- Write unit tests for all solutions
- Ensure all tests pass before committing

## 🛠️ Technology Stack

- **Language:** Java 17
- **Build Tool:** Apache Maven
- **Testing Framework:** JUnit 5
- **Version Control:** Git

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Your Name**
- GitHub: [@YOUR_USERNAME](https://github.com/YOUR_USERNAME)
- Email: your.email@example.com

## 🙏 Acknowledgments

- Thanks to all competitive programming platforms for providing excellent problems
- Inspired by the competitive programming community

## 📊 Stats

![GitHub repo size](https://img.shields.io/github/repo-size/YOUR_USERNAME/Platform_Problems)
![GitHub stars](https://img.shields.io/github/stars/YOUR_USERNAME/Platform_Problems?style=social)
![GitHub forks](https://img.shields.io/github/forks/YOUR_USERNAME/Platform_Problems?style=social)

---

⭐ **Star this repository if you find it helpful!**

*Happy Coding! 🎉*
