package com.quander.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.quander.generic.BaseClass;

public class CheckBaseClass extends BaseClass {
@Test
public void checkMethod()
{
	Reporter.log("success",true);
}
}
