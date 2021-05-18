import pytest

def test_addition():
	
    # Initialize two numbers
	num1 = 18
	num2 = 6

	sum = num1 + num2
	assert sum == 24

def test_subtraction():
  
	num1 = 46
	num2 = 24
    
	diff = num1 - num2
	assert diff == 22

@pytest.mark.activity
def test_multiplication():
  
	num1 = 8
	num2 = 15
   
	prod = num1 * num2
	assert prod == 120

@pytest.mark.activity
def test_division():
  
	num1 = 200
	num2 = 20

	quot = num1 / num2
	assert quot == 10