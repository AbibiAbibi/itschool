Challenge

1. Create an Animal class with sound() method that prints to console “animal makes sounds”

2. Create a Dog class that extends Animal and overrides sound() method; dogs make a particular sound, so we want to
   print “bark”, in this case

3. Create a Cat class that extends Animal and overrides sound() method, and in this case, we want to print in our method
   “meow”

4. Create a Wolf class that extends Animal, and overrides sound() method, and print “how”

5. Create a TestAnimal Class with a main method, create objects with each animal class created (dog, cat, wolf) and call
   sound()

6. Exploring Different Types of Inheritance with the "Vehicles" Domain Model
   For this exercise, we'll dive into the world of vehicles. Your task is to design three separate packages in Java to
   demonstrate the three types of inheritance: Single, Multilevel, and Hierarchical.

   Package 1: Single Inheritance
   Domain Model: Bicycles
   Classes:
   Bicycle
   MountainBike (inherits from Bicycle)
   Attributes:
   Bicycle: speed, gear
   MountainBike: tireType, suspension
   Methods:
   Bicycle: changeGear(), speedUp(), applyBrake()
   MountainBike: adjustSuspension()

   Package 2: Multilevel Inheritance
   Domain Model: Cars
   Classes:
   Car
   ElectricCar (inherits from Car)
   Tesla (inherits from ElectricCar)
   Attributes:
   Car: make, model, year
   ElectricCar: batteryCapacity, range
   Tesla: autopilotVersion
   Methods:
   Car: start(), stop(), accelerate()
   ElectricCar: charge()
   Tesla: enableAutopilot()

   Package 3: Hierarchical Inheritance
   Domain Model: Watercraft
   Classes:
   Boat
   SpeedBoat (inherits from Boat)
   FishingBoat (inherits from Boat)
   Attributes:
   Boat: length, weight
   SpeedBoat: maxSpeed, engineType
   FishingBoat: fishCapacity, typeOfNet
   Methods:
   Boat: sail()
   SpeedBoat: turboBoost()
   FishingBoat: castNet()

   Note: While the aforementioned attributes and methods are suggestions, feel free to be creative and add any other
   attributes or methods you deem relevant.

7. Bank Account Management System
   Imagine you're designing a simple Bank Account management system. Given the sensitive nature of financial
   information, you need to make sure that the data of an account holder is securely encapsulated and cannot be directly
   accessed or modified without appropriate checks.
   Requirements:

   Classes:
   BankAccount
   Attributes:
   accountHolderName: The name of the account holder.
   accountNumber: A unique identifier for the bank account. This should be automatically generated and read-only after
   account creation.
   balance: The current balance in the account. This should not be directly accessible.

   Methods:
   deposit(double amount): Allow a specified amount to be added to the balance. Ensure the deposited amount is positive.
   withdraw(double amount): Allow a specified amount to be subtracted from the balance. Ensure the account has enough
   funds and that the withdrawal amount is positive. If not, print an appropriate error message.
   getBalance(): Return the current balance. This is the only way to access the balance attribute from outside the
   class.
   getAccountDetails(): Print details about the account, including the account holder's name and account number.

   Instructions:
   Use private access modifiers for the attributes to ensure they are not directly accessible from outside the
   BankAccount class.
   Implement public methods to provide controlled access and modification of these attributes.
   Ensure that all methods have necessary checks to protect the integrity of the account data.

8. Bonus:
   Implement a transferFunds(BankAccount targetAccount, double amount) method that allows money to be transferred from
   one account to another. Ensure all required checks are in place for a successful transaction.




