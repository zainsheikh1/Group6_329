I heard you're good at math-100
MultipleChoice
The number of tries to to have n leading zeros in a hash of a prefix with the number of each try attached at the end (ex. H(prefix0), H(prefix1), H(prefix2), …) is:
2^n tries 
Log-base 2-(n) tries 
Square root (n) tries 
½(n)^2 tries
..............................................................................................................................
Explanation: 2^n tries
..............................................................................................................................
I heard you're good at math-100
MultipleChoice
What is lsb2(x) and msb4(x) of 1001100100
lsb2(x)=00, msb4(x)=1001
lsb2(x)=1001, msb4(x)=00
lsb2(x)=001, msb4(x)=100
lsb2(x)=011, msb4(x)=101
..............................................................................................................................
Explanation: msb is the highest digit, but and the lsb is the lowest digit bit. In the binary data, the left end is the highest digit, while the right end is the lowest digit. 
..............................................................................................................................
I heard you're good at math-200
MultipleChoice
Fill in the blanks. The implication of the perfect secrecy of the OTP is that if plaintext is m, ciphertext is c with probability ___
(½)^n
2^n
1/2
n
..............................................................................................................................
Explanation: ciphertext is c with probability (½)^n.
..............................................................................................................................
I heard you're good at math-200
MultipleChoice
We have a perfect secrecy is (Adv^(one-time))(A)=0. Which of the following is not false about A?
All the options.
A is allowed unbounded computational capacity
A is assumed to be the cleverest algorithm in existence
A has a limited storage capacity
..............................................................................................................................
Explanation: A is allowed unbounded computational capacity, it is assumed to be the cleverest algorithm in existence, and it has a limited storage capacity.
..............................................................................................................................
I heard you're good at math-200
MultipleChoice
Which of the following is not correct about the most significant bit (msb)?
Determines if number is even or odd
Determines length of binary representation
Means leftmost bit in a fixed-width representation
Leftmost 1 bit
..............................................................................................................................
Explanation: the lsb also determines whether the number is even or odd.
..............................................................................................................................
I heard you're good at math-300
MultipleChoice
What is 2^20? (Do not use a calculator)
1,048,576
1,048,576,288
524,288
2,097152
..............................................................................................................................
Explanation: 2^10=1,000; 2^20=1,000,000; 2^30=1,000,000,000
..............................................................................................................................
I heard you're good at math-400
MultipleChoice
Convert decimal to binary: 400
0b110010000
0b001101000011000000110000
0b0011011000110110
0b00110110
..............................................................................................................................
Explanation: use right-to-left repeated division-by-2 or left-to-right repeated subtraction.
..............................................................................................................................
I heard you're good at math-400
MultipleChoice
Convert binary to decimal: 0b11111
31
28
34
54
..............................................................................................................................
Explanation: use right-to-left weighted summation or left-to-right double-and-add methods.
..............................................................................................................................
I heard you're good at math-400
MultipleChoice
Convert binary to hexadecimal: 0b0101010101
155
4876696e46756e3f
4869
574c
..............................................................................................................................
Explanation: use right-to-left weighted summation or left-to-right double-and-add methods.
..............................................................................................................................
I heard you're good at math-400
MultipleChoice
Convert hexadecimal to binary: 0xa22
0b101000100010
0b011001100111010101101110
0b01001100
0b01010111
..............................................................................................................................
Explanation: use reverse substitution.
..............................................................................................................................
I heard you're good at math-500
MultipleChoice
Which of the following is a positional number system that uses a base of 2?
Binary
String
Char
Byte
Bit
Nybble
Word
..............................................................................................................................
Explanaton: 
Char - large enough to contain any ASCII or UTF-8 unit
Byte - a unit of data that consists of 8 bits, aka  octet 
String - sequence of characters, either as a literal constant or as some kind of variable
Binary - positional number system that uses a base of 2
Bit - a binary digit
Nybble - half an octet, aka  quartet 
Word - aggregation of bits handled as a unit by a CPU
..............................................................................................................................
I heard you're good at math-500
MultipleChoice
 CPSC  converted to Hex is:
435053430a
5269636b526f6c6c
3a2d29
59414159
..............................................................................................................................
Explanation: CPSC --> 435053430a
..............................................................................................................................
I heard you're good at math-500
MultipleChoice
What is the outcome of 1110XOR0101 = x, xOR0001=y. What is y?
1011
0001
1110
1010
..............................................................................................................................
Explanation: 1110XOR0101=1011OR0001=1011
..............................................................................................................................
I heard you're good at math-500
MultipleChoice
Which of the following is false?
1&1 is 0
Length of binary string |1100110011|=10
|ε| = 0
Hammer weight of 0b1100110011 is 5
..............................................................................................................................
Explanation: 1&1 is 1
..............................................................................................................................
Cybercriminal Methods-100
MultipleChoice
Since plenty of collisions exist in cryptographic hash functions, then they are very easy to find
False
True 
..............................................................................................................................
Explanation: cryptographic hash algorithms are long enough for random matches to be improbale, safe enough that it would be tough to find collisions and fast enough that they can be used anywhere.
..............................................................................................................................
Cybercriminal Methods-100
MultipleChoice
If the encryption scheme used is secure than the attacker always wins the indistinguishability game regardless of their strategy used.
False
True
..............................................................................................................................
Explanation: attacker always loses.
..............................................................................................................................
Cybercriminal Methods-200
MultipleChoice
Choose correct statements about preimage resistance(s): 1) the hash of a message reveals nothing about a message (can only confirm or reject guesses), 2) given the message and its hash, it’s hard to find another message that would give the same hash, 3) there are better ways to guess a message beyond simply guess and check, 4) the number of tries to get a collision is very small.
1), 2)
1), 3), 4)
2), 4)
3)
All of the options (1, 2, 3, 4)
..............................................................................................................................
Explanation: the hash of a message reveals nothing about a message and it’s hard to find another message that would give the same hash.
..............................................................................................................................
Cybercriminal Methods-200
MultipleChoice
Logic Bomb
Virus
Worm
Adware
..............................................................................................................................
Explanation: logic bomb can get activated when the user intentionally runs the code.
..............................................................................................................................
Cybercriminal Methods-200
MultipleChoice
Identify an incorrect statement about the worm malware?
Worms can replicate itself without any human interactions, but need to attach itself to a software program to cause damage
Exploits security flaws in widely deployed software as a path to infection
Worm can modify and delete files
The worm can spread via a dictionary attack against local accounts
..............................................................................................................................
Explanation: worms can replicate itself without any human interactions, and does not need to attach itself to a software program to cause damage
..............................................................................................................................
Cybercriminal Methods-200
MultipleChoice
Two friends have the same string as their passwords. Their passwords are stored as the same hash string in the password file. This discloses the fact that two accounts have the same passwords, allowing anyone who knows one of the account's password to access the other account. What is the best solution that will ensure that no one figures this out the password?
Friends can use a long, random salt 
Friends should create different passwords
Friends can use the same salt for every hashed password
Friends can use a short, random salt
..............................................................................................................................
Explanation: unsalted passwords chosen by humans tend to be vulnerable to dictionary attacks since they have to be short and meaningful enough to be memorized. By salting the passwords with two random characters, even if two accounts use the same passwords, no one can discover this just by reading hashes.
..............................................................................................................................
Cybercriminal Methods-200
MultipleChoice
Which statement is not incorrect about cryptographic hash function? 
Output is a string of a fixed length, most commonly 256 bits (32 bytes)
Two inputs do not always map to two outputs
Includes an unpredictable mapping of inputs and outputs
Input is retrieved to a 64 bit string of specific length
..............................................................................................................................
Explanation: cryptographic hash functions H turns any message into a short, unique and irreversible string of bits.
..............................................................................................................................
Cybercriminal Methods-200
MultipleChoice
Determine what type of encryption is described below: the size of cipher text is same in size or smaller than the original plain text; transfers large amount of data; provides confidentiality; low resource utilization.
Symmetric
Asymmetric
..............................................................................................................................
Explanation: symmetric encryption involves a single key for both decryption and encryption, and the asymmetric encryption uses a private key for decryption and  public key for encryption.
..............................................................................................................................
Cybercriminal Methods-200
MultipleChoice
md5 is a hash function that any reasonable person would use for applications today since it has collision resistance, therefore collisions do not lead to security failures with this function.
False
True
..............................................................................................................................
Explanation: md5 is an ancient hash function that no reasonable human would still use in applications where collisions lead to catastrophic security failures.
..............................................................................................................................
Cybercriminal Methods-200
MultipleChoice
If an email has an urgent call to action such as: you have 24 hours, renew immediately, you need to login, or something is expiring (Click Here), then it is likely not a phishing email
False
True
..............................................................................................................................
Explanation: an unfamiliar tone, grammar and spelling errors, inconsistencies in domain names and links, treats, urgent call for action, dubious attachments, requests for banking information are common signs of phishing emails. 
..............................................................................................................................
Cybercriminal Methods-200
MultipleChoice
The indistinguishability game defines secrecy for encryption schemes such as the one-time pad (OTP)
True
False
..............................................................................................................................
Explanation: the ciphertext will be impossible to decrypt or break if the following conditions are met: the key must be truly random, must be at least as long as the plaintext, must never be reused in whole or in part, must be kept a secret.
..............................................................................................................................
Cybercriminal Methods-300
MultipleChoice
An encryption scheme has three algorithms which include: 1) Gen creates (generates) one or more keys (pads), 2) Enc locks the message under a given key (encrypts that message), 3) Bre unlocks messages using any possible key (breaks the encryption - similar to lock picking), 4) Dec unlocks messages using an associated key (decrypts that message).
1), 2), 4)
1), 3), 4)
2), 3)
All of the options (1, 2, 3, 4)
..............................................................................................................................
Explanation: Gen, Enc and Dec are three algorithms of an encryption scheme.
..............................................................................................................................
Cybercriminal Methods-300
MultipleChoice
The pigeon-hole principle says that:
a) and b) only
a). If the domain of a hash function is much larger than its range, then many collisions exist
b). If the number of pigeons (number of possible hashes) is much larger than the range of the number of holes for pigeons, then many collisions exist 
c). If the number of holes for pigeons is much larger than the range of the number of pigeons (number of possible hashes), than many collisions exist
d). If the domain of a hash function is much smaller than its range, then many collisions exist
..............................................................................................................................
Explanation: the Pigeonhole Principle tells that if n+1 or more pigeons are located in n holes, then one hole contains two or more pigeons.
..............................................................................................................................
Cybercriminal Methods-300
MultipleChoice
Some viruses evade signature-based detection using polymorphic code. Which of the following is not a function of polymorphic code.
The code changes itself each time it runs and the function of the code changes as well.
Polymorphic code can be used to generate encryption algorithms. 
Every time the virus replicates, it modifies itself to look different
To detect a polymorphic virus, look for behaviours such as changes to system settings
..............................................................................................................................
Explanation: the code changes itself each time it runs, BUT the semantics of the code will not change at all. 
..............................................................................................................................
Cybercriminal Methods-300
MultipleChoice
The Flame malware used the hash-then-sign paradigm to make victims believe it was signed by Microsoft. This paradigm works by first hashing files, and then signing those hashed files.
True
False
..............................................................................................................................
Explanation: a signature scheme built based on the hash-and-sign paradigm first hashes the message and then signs the hash. σ(H(M)) is no more secure than the hash function H against a collision-finding attack. 
..............................................................................................................................
Cybercriminal Methods-300
MultipleChoice
What is phishing?
Pretending to be a trusted source through electronic communication so a victim is tricked into giving you sensitive information (passwords, credit/debit card details)
A misspelling of fishing
Malware hidden within a seemingly innocuous or desirable program such as a calculator application for a smartphone
Surreptitiously gathers information about users activities and transmits them to a third party (often bundled with some   legitimate  software)
..............................................................................................................................
Explanation:
Trojan - malware hidden within a seemingly innocuous or desirable program such as a calculator application for a smartphone
Phishing - pretending to be a trusted source through electronic communication so a victim is tricked into giving you sensitive information (passwords, credit/debit card details)
Spyware - Surreptitiously gathers information about users activities and transmits them to a third party (often bundled with some   legitimate  software)
..............................................................................................................................
Cybercriminal Methods-300
MultipleChoice
The one-time pad (OTP) encryption scheme has perfect secrecy except when: 1) The pad is used more than once, 2) The pad is not truly random, 3) The ciphertext is tinkered with (ex. changed or swapped out for another), 4) The pad is the same length or longer than the message it is encrypting.
1), 2), 3)
1), 3), 4)
2), 4)
All the options
..............................................................................................................................
Explanation: 4) is only bad when the pad is shorter than the message, meaning it must be used twice (bad) to encrypt the entire message
..............................................................................................................................
Cybercriminal Methods-400
MultipleChoice
Of the following options, select the notable malware events in history: 1) STUXnet, 2) SQL Slammer, 3) wabbit, 4) blankie, 5) creeper, 6) wasteland, 7) elk cloner
1), 2), 3), 5), 7)
1), 2), 4), 6), 7)
3), 4), 5), 6)
None of the options
All of the options
..............................................................................................................................
Explanation: creeper, reaper, wabbit, animal & prevade, elk cloner, code red, SQL Slammer, Sasser, STUXnet
..............................................................................................................................
Cybercriminal Methods-400
MultipleChoice
Ways to recognize if an email is a phishing email include: 1) Hovering over a link to see which website it takes you to, 2) Always checking the display or 'from' name, 3) The email doesn't ask for personal information, 4) Checking the logo of the company or the spelling of the company name.
1), 2), 4)
1), 3), 4)
2), 3)
None of the options 
All of the options
..............................................................................................................................
Explanation: there are several ways to recognize a phishing email: email is sent from a public email domain, misspelt domain name, email is poorly written, presence of suspicious attachments and message calls for urgent actions.
..............................................................................................................................
Cybercriminal Methods-400
MultipleChoice
Which of the following will not compromise the perfect secrecy of OTP encryption scheme?
Alice uses pad for only one encryption
Alice and Bob have no pre-shaded pad
H(password) is used instead of a pad
Eve tinkers with the ciphertext
..............................................................................................................................
Explanation: using pad for one encryption will not compromise the perfect secrecy of OTP.
..............................................................................................................................
Cybercriminal Methods-400
MultipleChoice
Which of the following is not a correct statement about viruses?
For documents with macros, virus copies itself to beginning of target program’s code
Viruses can quickly spread an include payload by downloading more malware
Viruses spread when files are shared between users
Viruses can put themselves in the boot sector and run before the OS boots
..............................................................................................................................
Explanation: for documents with macros, virus edits other documents and inserts as a macro to start automatically when the file is opened. 
..............................................................................................................................
Cybercriminal Methods-400
MultipleChoice
Hash functions should require collision resistance which requires it to be impossible to:
Input the same messages x0 and x0 that yield the same output h(x0) = h(x0) = y
Input the same messages x0 and x0 that yield different outputs h(x0) = y and h(x0) = z
Input different messages x0 and x1 that yield the same output h(x0) = h(x1) = y
Input different messages x0 and x1 that yield different outputs h(x0) = y and h(x1) = z
..............................................................................................................................
Explanation: impossible to input the same messages x0 and x0 that yield the same output h(x0) = h(x0) = y
..............................................................................................................................
Cybercriminal Methods-400
MultipleChoice
In the indistinguishability game, which is won by telling apart message1 and message2 after encryption, if the keys (single digits) and the messages (single digits) were the same size, and the  encryption  consists of only adding the key digit by digit to the plaintext then:
The attacker had no advantage or strategy to win
The attacker had an advantage and the strategy to win
The attacker had an advantage but no strategy to win
The attacker had no advantage but did have a strategy to win
..............................................................................................................................
Explanation: easy for attacker to win - example: key = 6,6, message1 = 0,0 message2= 9,9 then encryption = 6,6 and 15,15 - can easily tell what is message1 and what is message2.
..............................................................................................................................
Cybercriminal Methods-500
MultipleChoice
The one-time pad (OTP) was invented in 1919 by an engineer called Gilbert Vernam at AT&T labs and modernly it works by encrypting a plaintext through XORing it with a secret key (the OTP).
True
False
..............................................................................................................................
Explanation: true.
..............................................................................................................................
Cybercriminal Methods-500
MultipleChoice
In the indistinguishability game, which is won by telling apart message1 and message2 after encryption, if the keys (double digits) were larger than the messages (single digits) then:
The attacker had no advantage or strategy to win
The attacker had an advantage and the strategy to win
The attacker had an advantage but no strategy to win
The attacker had no advantage but did have a strategy to win
..............................................................................................................................
Explanation: if the keys are longer, when  encrypt  and add the keys (ex. 40) to the messages (ex. 9) than the number was always a double digit number so no way to tell what the key could have been.
..............................................................................................................................
Cybercriminal Methods-500
MultipleChoice
What does the md5sum command do?
Prints a 32-character (128-bit) checksum of the given file, using the MD5 algorithm.
Prints the 32-character md5 hash of a given file, using the MD5 algorithm.
Takes all 32-characters (128-bits) of an md5 hash of a file that are digits and sums them all up, using the MD5 algorithm.
Given two files, it adds the 32-character (128-bit) checksums of those two files, using the MD5 algorithm.
..............................................................................................................................
Explanation: md5sum prints a 32-character (128-bit) checksum of the given file, using the MD5 algorithm.
..............................................................................................................................
Cybercriminal Methods-500
MultipleChoice
What should you do to limit the damage if you fall for a phishing scam?
Delete the phishing email you fell for
Turn your computer off and on again to get rid of any possible malware.
Change any compromised passwords you gave away.
Call 911 and ask for the help of the information security personnel
..............................................................................................................................
Explanation: deleting the phishing email limits the damage.
..............................................................................................................................
Cybercriminal Methods-500
MultipleChoice
Select the correct matching of the malware taxonomy: Malware = 1) Spyware, 2) Root Kit, 3) Logic Bomb, 4) Worm, 5) Dropper; Definition = 1] Payload consists of installing some other malware on the infected host, 2] Covertly gathers information about users’ activities and transmits them to a third party, 3] Dormant payload with a program that triggers if some condition is met, 4] Malware that spreads with little-to-no user involvement, 5] Runs with highest possible privileges, uses privilege to hide its presence from system
1)→2], 2)→5], 3)→3], 4)→4] 5)→1]
5)→3], 4)→5], 3)→2], 2)→4] 1)→1]
..............................................................................................................................
Explanation: review lecture notes.
..............................................................................................................................
Linux & Mocha-100
MultipleChoice
ssh keygen is a tool for creating a new authentication key pair for SSH, which is used for logins and authenticating hosts. 
True 
False
..............................................................................................................................
Explanation: true.
..............................................................................................................................
Linux & Mocha-100
MultipleChoice
Everything is a textfile describes one of the defining features of Unix, and its derivatives—that a wide range of input/output resources such as documents, directories, hard-drives, modems, keyboards, printers and even some inter-process and network communications are simple streams of bytes exposed through the filesystem name space.
False
True 
..............................................................................................................................
Exploration: everything is a file on Linux is a generalization concept. If something is not a file, then it is running as a process on the system. 
..............................................................................................................................
Linux & Mocha-100
MultipleChoice
Select the Hex editors out of following options: 1) Notepad++, 2) Vim, 3) GNU emacs, 4) Atom
2), 3)
1), 2)
3), 4)
1), 4)
All of the options (1, 2, 3, 4)
..............................................................................................................................
Exploration: Notepad++ text editor, Vim hex editor, GNU emacs hex editor, Atom is for java/python/etc not hex.
..............................................................................................................................
Linux & Mocha-100
MultipleChoice
The three basic permission types (read, write, execute) are set on _____
File
Directory
Folder
Virtual machine
..............................................................................................................................
Exploration: the effect of setting the permission on a directory, rather than a file, is one the most frequently misunderstood file permission issues. 
..............................................................................................................................
Linux & Mocha-100
MultipleChoice
Grep command is used to search plain-text data sets for lines that match a regular expression in a specified file. This tool is useful when searching through large log files. 
True 
False
..............................................................................................................................
Explanation: true.
..............................................................................................................................
Linux & Mocha-100
MultipleChoice
Strategies to decipher ciphertexts with cribdragging include making the cribword: 1) The rarest words you can think of, 2) The most common word you can think of, 3) The longest word in the English language (pneumonoultramicroscopicsilicovolcanoconiosis), 4) A reasonable word or fragment of a word that would come after the plaintext (aka the already deciphered ciphertext). 
2), 4)
1), 3), 4)
1), 3)
All of the options (1, 2, 3, 4)
..............................................................................................................................
Explanation: strategies to decipher ciphertexts with cribdragging include making the cribword the most common word you can think of and a reasonable word that would come after the plaintext.
..............................................................................................................................
Linux & Mocha-200
MultipleChoice
____ hold information about the file such as type, size, physical location on disk; times of last access and last file modifications.
inode
nix access control
owner
setuid
..............................................................................................................................
Explanation: inode hold information about the file.
..............................................................................................................................
Linux & Mocha-200
MultipleChoice
Which of the following is false about sudo privileges:
Provides a root password to the user to reduces the possibilities of mistakes
Allows to run commands at the root level of system operation
Peak from a log which users used which commands
Manage the command a user can use on each host
..............................................................................................................................
Explanation: sudo does not provide a root password to the user to reduces the possibilities of mistakes
..............................................................................................................................

Linux & Mocha-200
MultipleChoice
Which of the following about the passphrase is false?
Passphrase is used to authenticate or log into a system, and refers to a secret used to protect an encryption key. 
Passphrase is used to encrypt the private key
No part of the passphrase should be derivable from personal information about the user and his/her family
Passphrase is usually longer than a password
..............................................................................................................................
Explanation: password is used to authenticate or log into a system, and refers to a secret used to protect an encryption key.
..............................................................................................................................
Linux & Mocha-200
MultipleChoice
Fill in the blank:______ is based on the host’s public key. It functions to identify and verify a particular key. If it changes, then the machine you are connecting to has changed its public key. 
Fingerprint
Randomart 
Passphrase 
ssh keypair
..............................................................................................................................
Explanation: fingerprint is based on the host’s public key.
..............................................................................................................................
Linux & Mocha-200
MultipleChoice
What line to type in order to see the permission for the owner, group and other user:
/bin/ls -l
/usr/bin/ls
/bin/ls
/bin/ls -c
..............................................................................................................................
Explanation: /bin/ls -l
..............................................................................................................................
Linux & Mocha-200
MultipleChoice
Cribdragging takes advantage of the one-time pad (OTP) weaknesses in that:
The pad was used multiple times to encrypt multiple messages.
The pad was used multiple times on the same message.
The pad was not randomly generated
Someone messed with the ciphertext
..............................................................................................................................
Example: the pad was used multiple times to encrypt multiple messages --> in tutorial the same pad is used to encrypt all 3 messages. The pad was not randomly generated --> this is a weakness but not what makes cribdragging work.
..............................................................................................................................
Linux & Mocha-300
MultipleChoice
Which of the following is not  a function of root administrator/superuser?
Can read other users’ passwords
Can change any users’ passwords
Can modify the operating system
Can become any other user
..............................................................................................................................
Explanation: passwords are not stored directly anywhere on the machine, so even root cannot read them
..............................................................................................................................
Linux & Mocha-300
MultipleChoice
What are the functions of cat command-line tool? Select from the following options: 1) Simultaneously create a new file and transfer to it the data from an existing file, 2) Connect the original file contents, 3) If the files with the same name already exists, it will be overwritten by the new, empty file, 4) Read the file contents.
1), 3), 4)
2), 3)
2), 4)
1), 2)
All of the options (1, 2, 3, 4)
..............................................................................................................................
Explanation: cat concatenates only the copies of the files, and there is no effect on the original files.
..............................................................................................................................
Linux & Mocha-300
MultipleChoice
Which of the following is true:
Execute permission must be set for executable programs, in order to allow the operating system to run them. 
Read permission grants the ability to read the contents of files in the directory, including the file type, size, ownership, permissions. 
Write permission grants the ability to modify the entries in the directory, which includes creating files, deleting files and renaming files without the set execute permission.
All of the above
..............................................................................................................................
Explanation: execute permission must be set for executable programs, in order to allow the operating system to run them.
..............................................................................................................................
Linux & Mocha-300
MultipleChoice
Setuid allows a system process to run with different privileges than the user who runs it. Setuid makes program run with _____ of the owner.
Effective UID (euid)
Real UID (ruid)
Saved UID (suid)
User ID
..............................................................................................................................
Explanation: setuid makes program run with euid of the owner
..............................................................................................................................
Linux & Mocha-400
MultipleChoice
 su  can be invoked with non-root passwords;  sudo  requires root password
False
True
..............................................................................................................................
Explanation: sudo can be invoked with non-root passwords; su requires root password
..............................................................................................................................
Linux & Mocha-400
MultipleChoice
Which of the following is a correct statement about dropping and acquiring setuid privileges?
To acquire privilege, assign euid to be a privileged UID
To acquire privilege, assign suid to be a privileged UID
To drop privileges temporarily, removed privileged UID from suid save it in euid
To drop privileges permanently, remove privileged UID from both suid and euid
..............................................................................................................................
Explanation: to acquire privilege, assign euid to be a privileged UID
..............................................................................................................................
Linux & Mocha-400
MultipleChoice
Words that are likely to be the plaintext in cribdragging, in relation to computer security topics are: 1) Meat, 2) Apple, 3) MFA, 4) CIRW.
2), 3)
1), 2), 4)
1), 3)
3), 4)
All of the options (1, 2, 3, 4)
..............................................................................................................................
Explanation: apple is the company, Meat is the food product, MFA – multi factor authentication, CIRW – random letters
..............................................................................................................................
Linux & Mocha-500
MultipleChoice
Correctly interpret the following line: anna localhost=(eve) foo fu
anna can use sudo to run commands foo or fu as user eve
eve can use sudo to run foo or fu
eve can use sudo on localhost
anna can run commands foo and fu as user eve
..............................................................................................................................
Explanation: anna can use sudo to run commands foo or fu as user eve
..............................................................................................................................
Linux & Mocha-500
MultipleChoice
Correctly pair the elements: Command/File: 1) /etc/passwd, 2) /etc/shadow, 3) umask, 4) Echo ; Purpose: 1] configures the file permissions of files, 2] outputs the strings it is being passed as arguments, 3] contain a list of the accounts and their user ID, encrypted password, home directory and login shell, 4] stores the hash of the password for user accounts
1) → 3], 2) → 4], 3) → 1], 4) → 2]
1) → 2], 3) → 4], 2) → 1], 4) → 3]
..............................................................................................................................
Explanation: review lecture notes.
..............................................................................................................................
Linux & Mocha-500
MultipleChoice
Select the correct matching of the cmd commands: Commands: 1) chown, 2) chgrp, 3) chmod, 4) umask; What it Does: 1] Change file group ownership, 2] View or set file create mask, 3] Change permissions on file, 4] Change file owner (and group ownership).
1)→ 4], 2) → 1], 3)→ 3], 4)→ 2]
4)→ 4], 3) → 1], 2)→ 3], 1)→ 2]
..............................................................................................................................
Explanation: review lecture notes.
..............................................................................................................................
Linux & Mocha-500
MultipleChoice
Which of the following is an incorrect use of first octet in nix permission bits?
4(100;s) means setgid
2(010;s) means setgid
1(001;t) means sticky
4(100;s) means setuid
..............................................................................................................................
Explanation: 2(010;s) means setgid, 1(001;t) means sticky, 4(100;s) means setuid.
..............................................................................................................................
Blockchain-100
MultipleChoice
Black holes are extraterrestrials’ failed attempts at finding two messages and random inputs that produce the same commitment (computational binding) due to making the computer too big.
False
True
..............................................................................................................................
Explanation: a big computer would be necessary to try and find two messages and random inputs that produce the same commitment, theoretically it would work. But there exists no big enough computer (nor can you build one with today's technology) to do that.
..............................................................................................................................
Blockchain-100
MultipleChoice
What description is most appropriate for Permissioned (consortium) blockchain?
All writers are known but not fully trusted
Experimentation and development
All writers are known and fully trusted
When not all writers are known
..............................................................................................................................
Explanation: these networks require access to be a part of (all writers are known) but you must not know writers in the real world (not fully trusted).
..............................................................................................................................
Blockchain-100
MultipleChoice
Merkle trees work by making a commitment of __ values  at once (for any n) which has final size __ bits.
2^n, 256
log(n), 128 
n^2, 256
n^3, 512 
..............................................................................................................................
Explanation: review lecture notes.
..............................................................................................................................
Blockchain-200
MultipleChoice
A digital signature scheme has 3 algorithms. Select the 3 out of these 4: 1) Gen - generates a pair of keys, 2) Sign - produces a signature under a given private key, 3) Plac - places the signature over a message, 4) Ver - verifies a signature using the associated public key.
1), 2), 4)
1), 2), 3)
2), 3), 4)
1), 3), 4)
..............................................................................................................................
Explanation: while the signature does sign messages, this isn’t a separate algorithm Plac
..............................................................................................................................
Blockchain-200
MultipleChoice
Merkle trees ‘one-wayness’ property (cannot infer what’s in the leaf nodes through the internal nodes) allows one to open a leaf node by revealing:
The data itself and 2 hashed values (in the simplest case)
The data itself and 1 hashed value (in the simplest case)
Not the data itself, just the 2 hashed values (in the simplest case)
Not the data itself and 1 hashed value (in the simplest case)
..............................................................................................................................
Explanation: the 2 hashed values are the hash of the other leaf and the commitment 
..............................................................................................................................
Blockchain-200
MultipleChoice
A digital identity is created using a [verification key (vk), signature key (sk)] key pair. This makes it possible to:
All of the above 
Be anonymous if vk (or H(vk)) looks random
Sk lets you  speak for  on vk
Generate as many identities as you want 
If sk is leaked to may, or everyone shares the same vk, than everyone acts as the same person and is therefore anonymous
..............................................................................................................................
Explanation: the 2 hashed values are the hash of the other leaf and the commitment 
..............................................................................................................................
Blockchain-300
MultipleChoice
Commitment schemes are a ______ algorithm that repeatedly _____ a message into _____, _____, and _____-looking string of bits.
Randomized, encodes, short, irreversible, random
Non-randomized, decode, long, reversible, non-random
Non-randomized, encodes, short, irreversible, non-random
Randomized, decode, long, reversible, random
..............................................................................................................................
Explanation: review lecture notes
..............................................................................................................................
Blockchain-300
MultipleChoice
Which element does not form a foundation of contract design?
Disintermediation
Privity
Observability
Verifiability
Enforceability
..............................................................................................................................
Explanation: disintermediation means the reduction in the use of intermediaries between producers and consumers. This is not necessary for a contract design.
..............................................................................................................................
Blockchain-300
MultipleChoice
Identify a correct option(s) about smart contracts?
There is one incorrect option 
Contact is an address associated with a code stored on the blockchain
Anyone can write a smart contract and deploy it to the network
Smart contracts can rely on external real world events to maintain security and decentralization
There are two incorrect options
..............................................................................................................................
Explanation: an incorrect option is c. Smart contracts cannot get information about real world events. Relying on external information can threaten security and decentralization. 
..............................................................................................................................
Blockchain-400
MultipleChoice
Which of the following is true about both Smart contracts and Vending machines:
All of the the options are correct
With the right inputs, a certain output is guaranteed
Have a logic programmed into it
Removes the need for an intermediaries
Only two of the options are correct
..............................................................................................................................
Explanation: review lecture notes. Smart contracts and vending machines have more similarties than you'd think!
..............................................................................................................................
Blockchain-400
MultipleChoice
The agent of an organization has the power to make decisions on behalf of another person and the entity. The agent might act in his own interests and the principal cannot control the agent’s actions. Is this description applicable to DAO?
No
Yes
In some cases
In few cases
..............................................................................................................................
Explanation: DAO eliminates the need to involve a mutually acceptable trusted third party in a financial translation. 
..............................................................................................................................
Blockchain-500
MultipleChoice
Which of the following statements is false about Bitcoin?
The transactions are irrevocable but allows to claim a legal recourse
Uses far more energy per transaction than all the world's banks put together
Bitcoin addresses should only be used once
Does not have economically responsive fiscal policy
..............................................................................................................................
Explanation: bitcoin transactions are irreversible, provide no dispute resolution or legal recourse and do not guarantee fraud protection.
..............................................................................................................................
Blockchain-500
MultipleChoice
SHA256 is: 1) SHA stands for Secure Hash Algorithm and 256 is the length of the output in bits, 2) A NIST standardized hash algorithm used in bitcoin, 3) Replaced with SHA3 due to the chance of finding collisions being less than 100 years.
1), 2)
1), 3)
2, 3)
All of the options (1, 2, 3)
None of the options
..............................................................................................................................
Explanation: no collisions are soon to be found so far in SHA (up to currently - year 2020), therefore it is very good and standardized by NIST. 
..............................................................................................................................
History and Rules-100
MultipleChoice
Which of the below is not one of three elements of the security triad:
Reliability
Integrity
Availability
Confidentiality
..............................................................................................................................
Explanation: elements of the security triad are Integrity, Availability and Confidentiality/
..............................................................................................................................
History and Rules-100
MultipleChoice
Who mentioned the story of Uncle Milton Industries selling ant farms and the importance of the security mindset?
Schneier
Adleman
Shamir
Rivest
..............................................................................................................................
Explanation: how dare you not know the three recipients of  Association for Computing Machinery's 2002 Turing Award  for their seminal contributions to the theory and practical application of public-key cryptography.
..............................................................................................................................
History and Rules-100
MultipleChoice
Using a Tor browser, your personal IP address will not be known resulting in your location (city) being incorrect.
True 
False 
..............................................................................................................................
Explanation: true
..............................................................................................................................
History and Rules-200
MultipleChoice
PIPEDA is Canada’s private-sector privacy law. Select 3 principles of PIPEDA of the following 4 statements: 1) Limit collection, 2) Be discreet, 3) Use appropiate safeguards, 4) Be accountable
1), 3), 4)
1), 2), 3)
2), 3), 4)
1), 2), 4)
..............................................................................................................................
Explanation:
Ten principles of PIPEDA:
Identify purposes of data collection
Obtain consent
Limit collection
Limit use, disclosure and retention
Use appropriate safeguards
Give individual access
Be accurate
Be open
Be accountable
Provide recourse
..............................................................................................................................
History and Rules-200
MultipleChoice
What was one of the largest ever breach of customer accounts, discussed in the lecture? 
Adobe
Equifax
eBay
Canva
..............................................................................................................................
Explanation: refer to the following reference: Reference: https://www.csoonline.com/article/2130877/the-biggest-data-breaches-of-the-21st-century.html
..............................................................................................................................
History and Rules-200
MultipleChoice
A secure system is one you can rely on to allow authorized modifications to resources and keep only your public data confidential.
False
True
..............................................................................................................................
Explanation: a secure system is one you can rely on to keep your personal data confidential. 
..............................................................................................................................
History and Rules-200
MultipleChoice
Find the author of the following principle:  It must not require secrecy, and it can easily fall into the hands of the enemy . 
Kerkchoff
Blastland
Harrison
Satlzer
..............................................................................................................................
Explanation: Kerkchoff
..............................................................................................................................
History and Rules-200
MultipleChoice
According to the Principle of Easiest Penetration, computer security is a game with rules that applies to both defending and attacking teams. 
False
True
..............................................................................................................................
Explanation: A: the attacker can and will use any means of penetration.
..............................................................................................................................
History and Rules-200
MultipleChoice
Which of the following is true about 2019 NIST password guidelines
At least 10 attempts before lockout
Supports at least 32 characters
b). Allow  password hints  and  secret questions 
c). Do not allow passwords to be copy-pasted into password fields
..............................................................................................................................
Explanation: NIST supports at least 64 characters; no  password hints  and  secret questions ; allow passwords to be copy-pasted into password fields
..............................................................................................................................
History and Rules-200
MultipleChoice
Your browsers fingerprint conveys _____ and as such, a fingerprint with a large size has more:
bits of identifying information, information on you (your OS, screen resolution, language set, etc.)
the list of all ads seen, ads on your browser
all invisible trackers on it, invisible trackers
bits of identifying information, information on the websites you visit (their number of visits, their most visited pages, etc.)
..............................................................................................................................
Explanation: bits of identifying information, information on you (your OS, screen resolution, language set, etc.)
..............................................................................................................................
History and Rules-300
MultipleChoice
What is the idea behind the  Separation of privilege  for the protection/security mechanism. 
When a protection mechanism require two keys, it allows for two-person control to prevent unilateral action by attackers. 
Base access decision on permission rather than exclusion
Security design should not depend on the ignorance of potential attacker
Every program and user should operate while invoking as few privileges as possible.
..............................................................................................................................
Explanation: when a protection mechanism require two keys, it allows for two-person control to prevent unilateral action by attackers. 
..............................................................................................................................
History and Rules-300
MultipleChoice
A unique fingerprint online means that your web browser:
is unique and you can be tracked as you navigate different websites within that web browser
is not unique and you cannot be tracked as you navigate different websites within that web browser
is unique and you cannot be tracked as you navigate different websites within that web browser
is not unique and you can be tracked as you navigate different websites within that web browser
..............................................................................................................................
Explanation: a unique fingerprint online means that your web browser is unique and you can be tracked as you navigate different websites within that web browser.
..............................................................................................................................
History and Rules-300
MultipleChoice
________ process of proving the claimed identity of the agent
authentication
authorizations
identification
verification
..............................................................................................................................
Explanation: authentication is a process of proving the claimed identity of the agent.
..............................................................................................................................
History and Rules-300
MultipleChoice
Which of the following add-on is described by the following: It learns to block invisible trackers. Instead of keeping lists of what to block, it automatically discovers trackers based on their behavior.
Privacy Badger
NoScript Security Suite
Lightbeam 3.0
Adblock Plus
..............................................................................................................................
Explanation: Privacy Badger
..............................................................................................................................
History and Rules-400
MultipleChoice
What argument is not supported in the Nothing to Hide paper:
Prevent terror attacks
Diminishes people’s rights
Allows government to leak information about a person even if the person did not engage in wrongdoing
Mass Surveillance can disproportionately affect certain groups of society
..............................................................................................................................
Explanation: read the paper at https://scholarship.law.gwu.edu/cgi/viewcontent.cgi?article=1159&context=faculty_publications 
..............................................................................................................................
History and Rules-400
MultipleChoice
Which of the following of the about Tor is not false?
All of the options are correct.
Isolates each website you visit so third-party trackers and ads cannot follow you
Automatically clears any cookies and browsing history when you are done browsing
Makes it difficult for the user to be fingerprinted 
Prevents someone watching your connection from knowing what websites you visit
..............................................................................................................................
Explanation: all of the options are correct.
..............................................................................................................................
History and Rules-400
MultipleChoice
Confinement ensures that misbehaving users and applications cannot harm the rest of the system. Identify all level(s) of enforcing confinement of the following options: 1) Thread separation, 2) Physical/hardware separation, 3) Arbitrary Separation, 4) Temporal separation.
1), 2), 4)
3), 4)
2)
None of the options
All of the options (1, 2, 3, 4)
..............................................................................................................................
Explanation: 1), 2), 4)
..............................................................................................................................
History and Rules-500
MultipleChoice
You send your public key to me over the WhatsApp. However, I do not know whether this key is indeed yours and this messaging app is not a secure channel. There is a possibility that Eve intercepted and replaced your key with hers. One way to solve this problem is to involve Bob, who knows your public key and I know his public key. How Bob can help us?
He signs your key by taking your public key and encrypt it with his private key
He signs your key by taking you private key and encrypt it with his private key
He signs your key by taking you public key and encrypt it with his public key
We do not need Bob because you can email your public key to me, and email is more secure than WhatsApp
..............................................................................................................................
Explanation: he signs your key by taking your public key and encrypt it with his private key
..............................................................................................................................
History and Rules-500
MultipleChoice
How do websites know your IP address and location (on most browsers)? When you visit a website: 1) IP addresses between the server hosting the website and your IP address must be exchanged to exchange data, 2) your IP address is known in your fingerprint and this IP address is given to the server hosting the website, 3) your IP address is given away but you’re not given the IP address of the server hosting the website.
1), 2)
2), 3)
1), 3)
None of the options
All of the options (1, 2, 3)
..............................................................................................................................
Explanation: IP addresses between the server hosting the website and your IP address must be exchanged to exchange data. Your IP address is known in your fingerprint and this IP address is given to the server hosting the website
..............................................................................................................................

