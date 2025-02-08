# **MassTokenGen**

**MassTokenGen** is a tool for generating tokens for commits in personal or professional projects. It was created to optimize the reading of commits and standardize their names in corporate environments, facilitating the organization and scalability of projects.

----------

## **Index**

- [How to install](#how-to-install)
- [How it works](#how-it-works)
  - [Generating a token](#generating-a-token)
  - [Reading a token](#reading-a-token)
- [How to collaborate](#how-to-collaborate)

----------

## **How ​​to install**

### **1. Download the project**

The first step is to download the project's `.zip` file. If you prefer, you can also clone the repository, but in this example we will continue with the installation via `.zip`.

![enter image description here](https://media.discordapp.net/attachments/1320878140414758993/1337830720952864918/image.png?ex=67a8df73&is=67a78df3&hm=af6368b57f9c8c220353a43617659581b2a837b9af275bc3af4dac14e8479298&=&format=webp&quality=lossless)

![enter image description here](https://media.discordapp.net/attachments/1320878140414758993/1337830985206861946/image.png?ex=67a8dfb2&is=67a78e32&hm=0237f6537980aa37d110d96d93381cca58f956aa76d743a668506d8ceadfde23&=&format=webp&quality=lossless)

### **2. Unzip the file**

After downloading, locate the `.zip` file and extract its contents to the desired folder.


![enter image description here](https://media.discordapp.net/attachments/1320878140414758993/1337831255957307524/image.png?ex=67a8dff3&is=67a78e73&hm=7f9b99e9d69ba29a5c14bc330f47d3bb89e0fcb4393b67fe2f91c2fcce53cf36&=&format=webp&quality=lossless)



### **3. Run the script**

Enter the unzipped folder and run the `run.bat` file.

![enter image description here](https://media.discordapp.net/attachments/1320878140414758993/1337831516931231775/image.png?ex=67a8e031&is=67a78eb1&hm=4d6adcbd37459277b4a5d24570d9011bcb74df8ac1db408c5d0f03a350146d53&=&format=webp&quality=lossless)



## **How ​​it works**

When you run `run.bat`, the program offers two options: **Generate a token** or **Read a token**.

### **Generating a token**

When you press `1`, the system will start the process of generating a token. You will be asked to enter some information:

1. Project name
2. Branch name
3. Current date
4. Type of code change

The available change types are:

| Type | Description |
|----------|--------------------------------------------------------------|
| `chore` | Minor changes that are not new features. |
| `docs` | Changes to documentation and wikis. |
| `feat` | Creation of new features. |
| `fix` | Bug fixes. |
| `refactor`| Refactoring code without changing functionality. |
| `style` | Changes to style and formatting (spaces, tabs, etc.).|
| `test` | Creation of tests for the application. |

After answering all the questions, a token will be generated in the following format:

```java
45(MassTokenGen:developer)06/02

```

### **Reading a token**

By pressing `2`, you can enter an existing token. The program will then decode the token and display the information formatted for easy reading.

----------

## **How ​​to contribute**

If you want to contribute to the development of **MassTokenGen**, follow the steps below:

1. Fork the repository.
2. Create a **branch** with your feature or fix.
3. Make a descriptive **commit** following the MassTokenGen standard.
4. Submit a **pull request** for review.

We welcome any contributions! 💡
