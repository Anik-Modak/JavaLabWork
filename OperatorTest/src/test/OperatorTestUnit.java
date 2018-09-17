package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorClass;

class OperatorTestUnit
{
	@Test
	public void Test() 
	{
		OperatorClass obj = new OperatorClass();
		
        assertEquals(11, obj.addition(10,1), " ");
        
        assertEquals(20, obj.multiply(10,2), " ");
        
        assertEquals(5, obj.division(10,2), " ");
        
        assertEquals(8, obj.subtraction(10,2), " ");
        
        assertEquals(2.5, obj.d_division(5,2), " ");
        
        assertEquals(true, obj.equals(10,10), " ");
        
        assertEquals(10, obj.leftshift(5,1), " ");
        
        assertEquals(2, obj.rightshift(5,1), " ");
        
        assertEquals(5, obj.xor(7,2), " ");
        
        assertEquals(2, obj.rightshift(5,1), " ");
        
        assertEquals(7, obj.or(7,2), " ");
        
        assertEquals(-3, obj.not(2), " ");
        
        assertEquals(2, obj.and(7,2), " ");
                 
	}

}
