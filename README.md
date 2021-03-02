Exploratory testing results of the Monefy mobile application on IOS.

Basic checklist:
 - user can add or remove accounts with default currency and some initial balance
    resources - account data
    information - data & account balance
    time 10 min
 - add income (only 3 categories are available) to one of the accounts
    resources: income sum, categories
    information: income amount by categories
    time 10 min
 - add the expense to one of the 12 default categories and to one of the accounts
    resources: expenses, categories
    information: expenses by categories
    time 20 min
 - user can transfer money between accounts
    resources: the amount of money, accounts
    information: the amount of money by accounts
    time 10 min
 - user can see transaction history
    resources: income & expenses amounts, date interval
    information: income & expenses amounts by a date interval
    time 5 min
 - user can see a diagram of the expenses by category for a selected interval 
    resources: expenses, categories, date interval
    information: transaction during date interval by categories
    time 5 min
 - user can filter transactions by date, by date interval & by account. Predefined intervals are: Day, Week, Month, Year
    resources: transactions, date interval
    information: transaction during date interval
    time 5 min

One of the main features is:
- Monefy Pro Buy offer. 
  Users can't perform some actions or use some features without buying Monefy Pro. This feature has the highest business priority.
It appears on: 
 - Settings menu - Categories - Try to change picture for the category
 - Settings menu - Accounts - Add Account - Select new currency 
 - Settings menu - Currencies
 - Settings menu - Settings - Passcode protection
 - Settings menu - Settings - Dark Theme
 - New income - schedule - Add
 - New expence - schedule - Add
 - Add income - select category - add new
 - Add expence - select category - add new
   time 15 min
   
 - Localization testing :
  Monefy support several languages 
  10 minutes for each language.
 
 - Device-specific testing 
    repeat testing on devices by priority.
    
Risks: Device coverage, localization & currencies coverage.    

No issues found, no blockers

