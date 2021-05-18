import pytest

def test_addition():
	
	num1 = 20
	num2 = 15
    
	# Add them
	sum = num1 + num2

	# Assertion
	assert sum == 35

def test_subtraction():
  
	num1 = 50
	num2 = 30
    
	diff = num1 - num2

	assert diff == 20

def test_multiplication():
  
	num1 = 5
	num2 = 10
    
	prod = num1 * num2
	assert prod == 50

def test_division():
  
	num1 = 100
	num2 = 5
    
	quot = num1 / num2

	assert quot == 20