package com.pr;



import java.util.*;

public class Press 
{

public static void main(String[] args) 
{
Vector v = new Vector();
Feeder f = new Feeder(v);
Copier c = new Copier(v,f);
c.start();
f.start();
}
}

