# -*- coding: utf-8 -*-
"""Day1Q1

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/12hbEZzLsAW_7qY7OVKELIDO7ApW2LcfF
"""

#Questions 1:
#Given the following jumbled word, OBANWRI guess the correct English word.
#A. RANIBOW
#B. RAINBOW
#C. BOWRANI
#D. ROBWANI

optlist=["RANIBOW", "RAINBOW", "BOWRANI", "ROBWANI" ]
correct="RAINBOW"
flag=0

for op in optlist:
  if op==correct:
    print("Correct")
    break
  if op!=wd:
    flag=flag+1
if flag==4:
  print("Wrong")

#Questions 2:
#Write a program which prints “LETS UPGRADE”. (Please note that you have to print in ALL CAPS as given)

print("LETS UPGRADE")

#Questions 3:
#Write a program that takes cost price and selling price as input and displays whether the transaction is anProfit or a Loss or Neither.
#INPUT FORMAT
#The first line contains the cost price.
#The second line contains the selling price.
#OUTPUT FORMAT
#Print "Profit" if the transaction is a profit or "Loss" if it is a loss. If it is neither
#profit nor loss, print "Neither". (You must not have quotes in your output)
cp=int(input())
sp=int(input())
if cp>sp:
  print("Loss")
elif cp<sp:
  print("Profit")
else:
  print("Neither")

#Questions 4:
#Write a program that takes an amount in Euros as input. You need to find its equivalent in Rupees and display it. Assume 1 Euro equals Rs. 80.
#Please note that you are expected to stick to the given input and output format as in sample test cases.
# Please don't add any extra lines such as 'Enter a number', etc.
#Your program should take only one number as input and display the output.
euros=int(input())
rs=80*euros
print(rs)