package com.assignments;

public class Arrays {

	public static void main(String[] args) {
		
		//Semester as first dimensional array	
       String Semester [][][]= {
    		   //Semester1 - subjects and Marks stored as second dimensional array
    		   {
    			   //Subject and Mark values stored as third dimensional array
    			   {"Mathematics I", "78" },
        		   {"Physics", "85" },
        		   {"Chemistry", "91" },
        		   {"Computer Programming", "74"},
        		   {"Engineering Drawing", "88"},
        		   {"Basic Electrical Eng", "79"}
    		   },
    		   
    		   //Semester2 - subjects and Marks stored as second dimensional array
    		   {
    			 //Subject and Mark values stored as third dimensional array
    			   {"Mathematics II", "82" },
        		   {"Mechanics", "77" },
        		   {"Env science", "93" },
        		   {"Basic Electronics", "69"},
        		   {"Engineering Physics", "84"},
        		   {"Engineering graphics", "90"}
    			   
    		   },
    		   
    		   //Semester3 - subjects and Marks stored as second dimensional array
    		   {
    			 //Subject and Mark values stored as third dimensional array
    			   {"Data Structures", "88" },
        		   {"Discrete Mathematics", "81" },
        		   {"Digital Electronics", "76" },
        		   {"Operating Systems", "92"},
        		   {"Signals and Systems", "85"},
        		   {"Object oriented program", "78"}
    			   
    		   },
    		   
    		   //Semester4 - subjects and Marks stored as second dimensional array
    		   {
    			 //Subject and Mark values stored as third dimensional array
    			   {"Algorithms", "91" },
        		   {"Computer Networks", "73" },
        		   {"Database Systems", "89" },
        		   {"Microprocessors", "80"},
        		   {"Communication Eng.", "76"},
        		   {"Software Engineering", "87"}
    			   
    		   },
    		   
    		   //Semester5 - subjects and Marks stored as second dimensional array
    		   {
    			 //Subject and Mark values stored as third dimensional array
    			   {"Probability and stats", "86" },
        		   {"Machine Learning", "88" },
        		   {"Compiler Design", "84" },
        		   {"Theory of Computation", "95"},
        		   {"Embedded Systems", "73"},
        		   {"Computer Graphics", "90"}
    			   
    		   }
    		   
    		   
       };
       
       //Printing Semester3 - Subject4 and mark scored
       System.out.println("Semester3 subject 4 is '" + Semester[2][3][0] + "' and Mark is " + Semester[2][3][1]);
       //System.out.println("' and Mark is " + Semester[2][3][1]);
       
       //Printing Semester3 - Subject5 and mark scored
       System.out.println("Semester3 subject 5 is '" + Semester[2][4][0] + "' and Mark is " + Semester[2][4][1]);
       //System.out.println("' and Mark is " + Semester[2][4][1]);
       
       //Printing Semester5 - Subject3 and mark scored
       System.out.println("Semester5 subject 3 is '" + Semester[4][2][0] + "' and Mark is " + Semester[4][2][1]);
       //System.out.println("' and Mark is " + Semester[4][2][1]);
       
       //Printing Semester5 - Subject6 and mark scored
       System.out.println("Semester5 subject 6 is '" + Semester[4][5][0] + "' and Mark is " + Semester[4][5][1]);
       //System.out.println("' and Mark is " + Semester[4][5][1]);
       
	}

};
