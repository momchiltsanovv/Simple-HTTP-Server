# Simple HTTP Server in Java

This project demonstrates how to create a simple HTTP server in Java using the `ServerSocket` class. The server listens for HTTP requests on a specified port (8080 in this example) and responds with the current date.

## Table of Contents

-   [Introduction](#introduction)
-   [Features](#features)
-   [Getting Started](#getting-started)
-   [Usage](#usage)
-   [Testing with Telnet](#testing-with-telnet)
-   [Limitations](#limitations)
-   [License](#license)

## Introduction

Java provides excellent networking support, allowing the development of client-server applications using TCP sockets. This tutorial covers the creation of an HTTP server that can handle incoming requests and send responses using basic Java networking features.

## Features

-   Listens for incoming HTTP requests on port 8080.
-   Responds with the current date in the HTTP response.
-   Simple implementation suitable for educational purposes.

## Getting Started

To run this project, you need to have Java Development Kit (JDK) installed on your machine. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use OpenJDK.

### Prerequisites

-   Java JDK 8 or higher
-   An IDE (like Eclipse, IntelliJ IDEA) or a simple text editor
-   Command Line Interface (CLI) for running the Java application

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/simple-http-server.git
## Usage
Once the server is running, open your web browser and navigate to:

http://localhost:8080
You should see the current date displayed in your browser.

## Testing with Telnet
To test the server using telnet, follow these steps:
	1.	Open your terminal or command prompt.
	2.	Connect to the server by running the following command:
```bash
   telnet localhost 8080
```
If telnet is not installed, you may need to install it first. On Windows, you can enable it via Control Panel. On Linux, you can install it using your package manager (e.g., sudo apt install telnet).
<br>
<br>
For macOS, you can install telnet using Homebrew:
```bash
brew install telnet
```
## Limitations
   The server can only handle one client at a time. If a request takes too long to process, subsequent requests will have to wait.
	This implementation does not handle different types of HTTP requests or serve static files.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

This README now provides complete instructions for users on how to set up and test the HTTP server, including how to install necessary tools based on their operating system.
