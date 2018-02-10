package ArrayExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;


/**
 * @author Guillermo Vigueras
 *
 */

public class Tester1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		      String[] ids = ManagementFactory.getRuntimeMXBean().getName()
			  .split("@");
		      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
		      bw.write(ids[0]);
		      bw.close();
		} catch (Exception e) {
		    System.out.println("Avisa al profesor de fallo sacando el PID");
		}

		{
			String str = null;
			String strArr[] = new String[]{null};
			int reps = 1;
			do_check(str,strArr,reps);
		}		

		{
			String str = null;
			String strArr[] = new String[]{null, "abc",null};
			do_check(str,strArr,2);
		}		
		
	    ////////////////////////////// BEGIN AUTO-GENERATED TEST CASES //////////////////////////////		
		{
			String str = new String("");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", null, null, null, null, null, null};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", null, null, null, null, null, null};
			int reps = 9;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", null, null, null, null, null, null};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", null, null, null, null, null, null};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"eah", "hed", "hed", "hed", "", ""};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah", "hed", "hed", "hed", "", ""};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"eah", "hed", "hed", "hed", "", ""};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah", "hed", "hed", "hed", "", ""};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah", "eah", "eah"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah", "eah", "eah"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"eah", "eah", "eah", "ae", "ae", "ae", "ae", "ae", "hed", "be", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah", "eah", "eah", "ae", "ae", "ae", "ae", "ae", "hed", "be", "be"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"eah", "eah", "eah", "ae", "ae", "ae", "ae", "ae", "hed", "be", "be"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah", "eah", "eah", "ae", "ae", "ae", "ae", "ae", "hed", "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"eah", "eah", "eah", "ae", "ae", "ae", "ae", "ae", "hed", "be", "be"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "hed", "hed", "hed", "hed", "hed", "hed", null, "eah", "eah", "eah", "eah"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "hed", "hed", "hed", "hed", "hed", "hed", null, "eah", "eah", "eah", "eah"};
			int reps = 8;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "hed", "hed", "hed", "hed", "hed", "hed", null, "eah", "eah", "eah", "eah"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "hed", "hed", "hed", "hed", "hed", "hed", null, "eah", "eah", "eah", "eah"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"egdh", "egdh", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "bdeg", "hab", "hab", "hab", "hab", "hab"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"egdh", "egdh", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "bdeg", "hab", "hab", "hab", "hab", "hab"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"egdh", "egdh", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "bdeg", "hab", "hab", "hab", "hab", "hab"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"egdh", "egdh", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "bdeg", "hab", "hab", "hab", "hab", "hab"};
			int reps = 10;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"egdh", "egdh", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "bdeg", "hab", "hab", "hab", "hab", "hab"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"ae", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"ae", "egdh"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"ae", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah", "eah", "", "", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah", "eah", "", "", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah"};
			int reps = 18;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"eah", "eah", "", "", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"", null, null, "", "", "", "", ""};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"", null, null, "", "", "", "", ""};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"", null, null, "", "", "", "", ""};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "hab", "hab", "ae", null, "egdh", "egdh"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "hab", "hab", "ae", null, "egdh", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "hab", "hab", "ae", null, "egdh", "egdh"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "hab", "hab", "ae", null, "egdh", "egdh"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "hab", "hab", "ae", null, "egdh", "egdh"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "hab", "hab", "ae", null, "egdh", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "decb", "decb", "decb", "decb", "hab", "hab", "hab", "hed", "hed"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "decb", "decb", "decb", "decb", "hab", "hab", "hab", "hed", "hed"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "decb", "decb", "decb", "decb", "hab", "hab", "hab", "hed", "hed"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "decb", "decb", "decb", "decb", "hab", "hab", "hab", "hed", "hed"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "decb", "decb", "decb", "decb", "hab", "hab", "hab", "hed", "hed"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{null, "", "", "", "", "", "", "be", null, null};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{null, "", "", "", "", "", "", "be", null, null};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{null, "", "", "", "", "", "", "be", null, null};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{null, "", "", "", "", "", "", "be", null, null};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"hed"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hed"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"bdeg", "bdeg"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"bdeg", "bdeg"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{null, null, null, "be", "be", "be", "be", "be", "be", "decb", "decb", "hed", "hed", "hed", "hed", "ae"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{null, null, null, "be", "be", "be", "be", "be", "be", "decb", "decb", "hed", "hed", "hed", "hed", "ae"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{null, null, null, "be", "be", "be", "be", "be", "be", "decb", "decb", "hed", "hed", "hed", "hed", "ae"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{null, null, null, "be", "be", "be", "be", "be", "be", "decb", "decb", "hed", "hed", "hed", "hed", "ae"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{null, null, null, "be", "be", "be", "be", "be", "be", "decb", "decb", "hed", "hed", "hed", "hed", "ae"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{null, null, null, "be", "be", "be", "be", "be", "be", "decb", "decb", "hed", "hed", "hed", "hed", "ae"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{null, "", "", "", "", "", "", "", "", "", null};
			int reps = 9;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{null, "", "", "", "", "", "", "", "", "", null};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{null, "", "", "", "", "", "", "", "", "", null};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"ae", "ae"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"ae", "ae"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"decb", "decb", "decb"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"decb", "decb", "decb"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"", "", "", "", "", "hed", "hed", "decb", "decb"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"", "", "", "", "", "hed", "hed", "decb", "decb"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"", "", "", "", "", "hed", "hed", "decb", "decb"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"", "", "", "", "", "hed", "hed", "decb", "decb"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "egdh"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "egdh"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah", "eah", null, "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah", "eah", null, "be", "be"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"eah", "eah", null, "be", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"eah", "eah", null, "be", "be"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", null, null, null, "", "", null, null};
			int reps = 10;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", null, null, null, "", "", null, null};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", null, null, null, "", "", null, null};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", null, null, null, "", "", null, null};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hab"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"hab"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "bdeg"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "bdeg"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "bdeg"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{""};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{""};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "gdech", "gdech", "eah"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "gdech", "gdech", "eah"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "gdech", "gdech", "eah"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "gdech", "gdech", "eah"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"decb", "decb", "decb", "ae", "eah", "", "", "", "", ""};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"decb", "decb", "decb", "ae", "eah", "", "", "", "", ""};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"decb", "decb", "decb", "ae", "eah", "", "", "", "", ""};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"decb", "decb", "decb", "ae", "eah", "", "", "", "", ""};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"decb", "decb", "decb", "ae", "eah", "", "", "", "", ""};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "eah", "egdh", "egdh", "egdh", "egdh", "hab", "hab", null, "", "be", "egdh", "egdh", "egdh", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "eah", "egdh", "egdh", "egdh", "egdh", "hab", "hab", null, "", "be", "egdh", "egdh", "egdh", "egdh"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "eah", "egdh", "egdh", "egdh", "egdh", "hab", "hab", null, "", "be", "egdh", "egdh", "egdh", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "eah", "egdh", "egdh", "egdh", "egdh", "hab", "hab", null, "", "be", "egdh", "egdh", "egdh", "egdh"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "eah", "egdh", "egdh", "egdh", "egdh", "hab", "hab", null, "", "be", "egdh", "egdh", "egdh", "egdh"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "eah", "egdh", "egdh", "egdh", "egdh", "hab", "hab", null, "", "be", "egdh", "egdh", "egdh", "egdh"};
			int reps = 8;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "eah", "egdh", "egdh", "egdh", "egdh", "hab", "hab", null, "", "be", "egdh", "egdh", "egdh", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"", "", "", "eah", "", "eah", "eah", "eah", "eah", "eah", "hed"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"", "", "", "eah", "", "eah", "eah", "eah", "eah", "eah", "hed"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"", "", "", "eah", "", "eah", "eah", "eah", "eah", "eah", "hed"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"", "", "", "eah", "", "eah", "eah", "eah", "eah", "eah", "hed"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"hed", "hed", "be", "be", "be"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"hed", "hed", "be", "be", "be"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hed", "hed", "be", "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"", "", "", "hab", "hab", null, null, "eah", "eah", "", "be", "be", "", "", "", "", "", "", ""};
			int reps = 11;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"", "", "", "hab", "hab", null, null, "eah", "eah", "", "be", "be", "", "", "", "", "", "", ""};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"", "", "", "hab", "hab", null, null, "eah", "eah", "", "be", "be", "", "", "", "", "", "", ""};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"", "", "", "hab", "hab", null, null, "eah", "eah", "", "be", "be", "", "", "", "", "", "", ""};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"", "", "", "hab", "hab", null, null, "eah", "eah", "", "be", "be", "", "", "", "", "", "", ""};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"", "", "", "hab", "hab", null, null, "eah", "eah", "", "be", "be", "", "", "", "", "", "", ""};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{null, "gdech", null, null, null, null, "decb", "decb", "decb", "decb", "decb", "decb", "bdeg", "bdeg", "bdeg", "be", null, null, null};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{null, "gdech", null, null, null, null, "decb", "decb", "decb", "decb", "decb", "decb", "bdeg", "bdeg", "bdeg", "be", null, null, null};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{null, "gdech", null, null, null, null, "decb", "decb", "decb", "decb", "decb", "decb", "bdeg", "bdeg", "bdeg", "be", null, null, null};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{null, "gdech", null, null, null, null, "decb", "decb", "decb", "decb", "decb", "decb", "bdeg", "bdeg", "bdeg", "be", null, null, null};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{null, "gdech", null, null, null, null, "decb", "decb", "decb", "decb", "decb", "decb", "bdeg", "bdeg", "bdeg", "be", null, null, null};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{null, "gdech", null, null, null, null, "decb", "decb", "decb", "decb", "decb", "decb", "bdeg", "bdeg", "bdeg", "be", null, null, null};
			int reps = 8;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"be", "be", "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"be", "be", "be", "be"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"eah", "eah", "eah", "eah", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be", "be"};
			int reps = 13;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"be", ""};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"be", ""};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"be", ""};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"egdh", "", "", "", "", "", "ae", null, "egdh", "egdh", "egdh", "be", "be"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"egdh", "", "", "", "", "", "ae", null, "egdh", "egdh", "egdh", "be", "be"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"egdh", "", "", "", "", "", "ae", null, "egdh", "egdh", "egdh", "be", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"egdh", "", "", "", "", "", "ae", null, "egdh", "egdh", "egdh", "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"egdh", "", "", "", "", "", "ae", null, "egdh", "egdh", "egdh", "be", "be"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"egdh", "", "", "", "", "", "ae", null, "egdh", "egdh", "egdh", "be", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hab", "", "", "", "ae"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"hab", "", "", "", "ae"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"hab", "", "", "", "ae"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"hab", "", "", "", "ae"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"decb"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"decb"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"egdh", "ae", "ae", "bdeg"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"egdh", "ae", "ae", "bdeg"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"egdh", "ae", "ae", "bdeg"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"egdh", "ae", "ae", "bdeg"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"ae"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"ae"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"", "", "", "", "eah", "eah", "eah", "eah", "be", "", "", "", "", "", ""};
			int reps = 10;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"", "", "", "", "eah", "eah", "eah", "eah", "be", "", "", "", "", "", ""};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"", "", "", "", "eah", "eah", "eah", "eah", "be", "", "", "", "", "", ""};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"", "", "", "", "eah", "eah", "eah", "eah", "be", "", "", "", "", "", ""};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "be", "be", "be", "be", "be", "be", "be", "gdech", "gdech", ""};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "be", "be", "be", "be", "be", "be", "be", "gdech", "gdech", ""};
			int reps = 7;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "be", "be", "be", "be", "be", "be", "be", "gdech", "gdech", ""};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "be", "be", "be", "be", "be", "be", "be", "gdech", "gdech", ""};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "be", "be", "be", "be", "be", "be", "be", "gdech", "gdech", ""};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "eah", "eah", "hab", "hed", "eah"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "eah", "eah", "hab", "hed", "eah"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "eah", "eah", "hab", "hed", "eah"};
			int reps = 14;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "eah", "eah", "hab", "hed", "eah"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "decb", "be", "be", "be", "be", "be", "be"};
			int reps = 12;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "decb", "be", "be", "be", "be", "be", "be"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "decb", "be", "be", "be", "be", "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "decb", "be", "be", "be", "be", "be", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"", "", "", "", "", "", "be", "decb"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"", "", "", "", "", "", "be", "decb"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"", "", "", "", "", "", "be", "decb"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"", "", "", "", "", "", "be", "decb"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", null, "be", "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", null, "be", "be", "be"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", null, "be", "be", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", null, "be", "be", "be"};
			int reps = 14;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "gdech", "gdech", "gdech", null, "eah", null, null, null, null, "egdh", "egdh"};
			int reps = 7;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "gdech", "gdech", "gdech", null, "eah", null, null, null, null, "egdh", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "gdech", "gdech", "gdech", null, "eah", null, null, null, null, "egdh", "egdh"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "gdech", "gdech", "gdech", null, "eah", null, null, null, null, "egdh", "egdh"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "gdech", "gdech", "gdech", null, "eah", null, null, null, null, "egdh", "egdh"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"ae", "ae", "ae", "ae", "ae", "ae", "ae", "decb", "decb"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"ae", "ae", "ae", "ae", "ae", "ae", "ae", "decb", "decb"};
			int reps = 7;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"ae", "ae", "ae", "ae", "ae", "ae", "ae", "decb", "decb"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "", "", "", "", "decb", "egdh"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "", "", "", "", "decb", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "", "", "", "", "decb", "egdh"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "", "", "", "", "decb", "egdh"};
			int reps = 12;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"bdeg", "bdeg", "eah", "eah", "eah", "eah"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"bdeg", "bdeg", "eah", "eah", "eah", "eah"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"bdeg", "bdeg", "eah", "eah", "eah", "eah"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "hab", "hab", "ae", "decb", "eah"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "hab", "hab", "ae", "decb", "eah"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "hab", "hab", "ae", "decb", "eah"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "hab", "hab", "ae", "decb", "eah"};
			int reps = 8;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "hab", "hab", "ae", "decb", "eah"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "hab", "hab", "ae", "decb", "eah"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "hab", "hab", "ae", "decb", "eah"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "ae", "ae", "bdeg"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "ae", "ae", "bdeg"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "ae", "ae", "bdeg"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "ae", "ae", "bdeg"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"decb", "", "", "", "gdech", "decb", "ae"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"decb", "", "", "", "gdech", "decb", "ae"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"decb", "", "", "", "gdech", "decb", "ae"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"decb", "", "", "", "gdech", "decb", "ae"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"decb", "", "", "", "gdech", "decb", "ae"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"eah", "hed"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah", "hed"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah", "hed"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"ae", "ae", "ae", "ae", "ae", "ae", "bdeg"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"ae", "ae", "ae", "ae", "ae", "ae", "bdeg"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"ae", "ae", "ae", "ae", "ae", "ae", "bdeg"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"bdeg", "hab", "hab", "bdeg", "bdeg", "bdeg", "bdeg", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"bdeg", "hab", "hab", "bdeg", "bdeg", "bdeg", "bdeg", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"bdeg", "hab", "hab", "bdeg", "bdeg", "bdeg", "bdeg", "be"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"bdeg", "hab", "hab", "bdeg", "bdeg", "bdeg", "bdeg", "be"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"ae", "ae", "bdeg", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "ae", "ae"};
			int reps = 15;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"ae", "ae", "bdeg", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "ae", "ae"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"ae", "ae", "bdeg", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "ae", "ae"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"ae", "ae", "bdeg", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "ae", "ae"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"ae"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"ae"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "eah", "be", "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "eah", "be", "be", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "eah", "be", "be", "be"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "eah", "be", "be", "be"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"gdech", "gdech", "bdeg", "bdeg"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"gdech", "gdech", "bdeg", "bdeg"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"gdech", "gdech", "bdeg", "bdeg"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"decb"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"decb"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"egdh", "egdh", "hed", "hed", "be", "be", "be", "decb"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"egdh", "egdh", "hed", "hed", "be", "be", "be", "decb"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"egdh", "egdh", "hed", "hed", "be", "be", "be", "decb"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"egdh", "egdh", "hed", "hed", "be", "be", "be", "decb"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"egdh", "egdh", "hed", "hed", "be", "be", "be", "decb"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"bdeg", "ae", "ae", "ae", "ae", "eah", "eah", "eah", "eah", "egdh", "egdh", "ae", "ae"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"bdeg", "ae", "ae", "ae", "ae", "eah", "eah", "eah", "eah", "egdh", "egdh", "ae", "ae"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"bdeg", "ae", "ae", "ae", "ae", "eah", "eah", "eah", "eah", "egdh", "egdh", "ae", "ae"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"bdeg", "ae", "ae", "ae", "ae", "eah", "eah", "eah", "eah", "egdh", "egdh", "ae", "ae"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"bdeg", "ae", "ae", "ae", "ae", "eah", "eah", "eah", "eah", "egdh", "egdh", "ae", "ae"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"hab", "hed", "hed", "hed", "egdh", "", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"hab", "hed", "hed", "hed", "egdh", "", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"hab", "hed", "hed", "hed", "egdh", "", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab"};
			int reps = 14;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"hab", "hed", "hed", "hed", "egdh", "", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hab", "hed", "hed", "hed", "egdh", "", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hab", "hed", "hed", "hed"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hab", "hed", "hed", "hed"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hab", "hed", "hed", "hed"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"bdeg", "bdeg", "decb", "hab", "be", "hab", "hab", "decb", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"bdeg", "bdeg", "decb", "hab", "be", "hab", "hab", "decb", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"bdeg", "bdeg", "decb", "hab", "be", "hab", "hab", "decb", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg"};
			int reps = 9;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"bdeg", "bdeg", "decb", "hab", "be", "hab", "hab", "decb", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"bdeg", "bdeg", "decb", "hab", "be", "hab", "hab", "decb", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"be", "be", "", "", "", "", "", "", "", "", "", "", null, null, null, null, null};
			int reps = 10;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"be", "be", "", "", "", "", "", "", "", "", "", "", null, null, null, null, null};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"be", "be", "", "", "", "", "", "", "", "", "", "", null, null, null, null, null};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"be", "be", "", "", "", "", "", "", "", "", "", "", null, null, null, null, null};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", null, null};
			int reps = 16;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", null, null};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", "hed", null, null};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"egdh"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech"};
			int reps = 7;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "decb", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech", "gdech"};
			int reps = 12;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "gdech", "gdech", "eah", "hed", "hed", "hed"};
			int reps = 9;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "gdech", "gdech", "eah", "hed", "hed", "hed"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "gdech", "gdech", "eah", "hed", "hed", "hed"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hed", "hed", "hed", "hed", "hed", "hed", "gdech", "gdech", "eah", "hed", "hed", "hed"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"egdh", null, null, "be", "be", "be", "hed", "decb", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"egdh", null, null, "be", "be", "be", "hed", "decb", "be"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"egdh", null, null, "be", "be", "be", "hed", "decb", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"egdh", null, null, "be", "be", "be", "hed", "decb", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"egdh", null, null, "be", "be", "be", "hed", "decb", "be"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"egdh", null, null, "be", "be", "be", "hed", "decb", "be"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"be", "be", "be", "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"be", "be", "be", "be", "be"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"be", "be", "be", "hed", "hed", "be", "gdech", "bdeg", "bdeg", "bdeg", "bdeg", "hed", "hed", "hed"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"be", "be", "be", "hed", "hed", "be", "gdech", "bdeg", "bdeg", "bdeg", "bdeg", "hed", "hed", "hed"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"be", "be", "be", "hed", "hed", "be", "gdech", "bdeg", "bdeg", "bdeg", "bdeg", "hed", "hed", "hed"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"be", "be", "be", "hed", "hed", "be", "gdech", "bdeg", "bdeg", "bdeg", "bdeg", "hed", "hed", "hed"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"be", "be", "be", "hed", "hed", "be", "gdech", "bdeg", "bdeg", "bdeg", "bdeg", "hed", "hed", "hed"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, "ae", "ae"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, "ae", "ae"};
			int reps = 14;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, "ae", "ae"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "egdh", "egdh"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "egdh", "egdh"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"gdech", "gdech", "gdech", "gdech", "egdh", "egdh"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "be", "be", "be", "be"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "be", "be", "be", "be"};
			int reps = 8;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "be", "be", "be", "be"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"egdh", "egdh", "egdh", "egdh", "egdh", "egdh", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "eah", "be", "be", "be", "be"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"", "", "", "hed", "hed", "hed", "hed", "", "", "", "", ""};
			int reps = 8;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"", "", "", "hed", "hed", "hed", "hed", "", "", "", "", ""};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{"", "", "", "hed", "hed", "hed", "hed", "", "", "", "", ""};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "be", "be", "be", "be", "be", "be", "decb", "decb", "hab", "hed"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "be", "be", "be", "be", "be", "be", "decb", "decb", "hab", "hed"};
			int reps = 6;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "be", "be", "be", "be", "be", "be", "decb", "decb", "hab", "hed"};
			int reps = 9;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "be", "be", "be", "be", "be", "be", "decb", "decb", "hab", "hed"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hab", "hab", "hab", "hab", "hab", "hab", "hab", "hab", "be", "be", "be", "be", "be", "be", "decb", "decb", "hab", "hed"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"hed"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hed"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"bdeg", "bdeg", "decb", "decb", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"bdeg", "bdeg", "decb", "decb", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg"};
			int reps = 11;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("decb");
			String[] arr1 = new String[]{"bdeg", "bdeg", "decb", "decb", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "hab"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "hab"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "ae", "hab"};
			int reps = 14;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"bdeg", "bdeg", "bdeg", "bdeg", "ae", "ae", "ae", "ae"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"bdeg", "bdeg", "bdeg", "bdeg", "ae", "ae", "ae", "ae"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"bdeg", "bdeg", "bdeg", "bdeg", "ae", "ae", "ae", "ae"};
			int reps = 4;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, "hab", "hab"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, "hab", "hab"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = null;
			String[] arr1 = new String[]{null, null, null, null, null, null, null, null, "hab", "hab"};
			int reps = 8;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"hab", "gdech"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hab");
			String[] arr1 = new String[]{"hab", "gdech"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"hab", "gdech"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"eah", "eah"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"eah", "eah"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("egdh");
			String[] arr1 = new String[]{"bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "eah", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "eah", "egdh"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("bdeg");
			String[] arr1 = new String[]{"bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "eah", "egdh"};
			int reps = 10;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "bdeg", "eah", "egdh"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("");
			String[] arr1 = new String[]{"ae", "ae", "gdech", "gdech", "gdech", "gdech", "gdech", "eah", "be", "be", "hed", "hed", "hed"};
			int reps = 0;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("eah");
			String[] arr1 = new String[]{"ae", "ae", "gdech", "gdech", "gdech", "gdech", "gdech", "eah", "be", "be", "hed", "hed", "hed"};
			int reps = 1;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("ae");
			String[] arr1 = new String[]{"ae", "ae", "gdech", "gdech", "gdech", "gdech", "gdech", "eah", "be", "be", "hed", "hed", "hed"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("be");
			String[] arr1 = new String[]{"ae", "ae", "gdech", "gdech", "gdech", "gdech", "gdech", "eah", "be", "be", "hed", "hed", "hed"};
			int reps = 2;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("gdech");
			String[] arr1 = new String[]{"ae", "ae", "gdech", "gdech", "gdech", "gdech", "gdech", "eah", "be", "be", "hed", "hed", "hed"};
			int reps = 5;
			do_check(str,arr1,reps);
		}

		{
			String str = new String("hed");
			String[] arr1 = new String[]{"ae", "ae", "gdech", "gdech", "gdech", "gdech", "gdech", "eah", "be", "be", "hed", "hed", "hed"};
			int reps = 3;
			do_check(str,arr1,reps);
		}

		////////////////////////////// END AUTO-GENERATED TEST CASES //////////////////////////////		
		
		System.out.println("\n Tester1: Test finalizado correctamente.");
	}
	
	static void do_check(String s,String[] strArr, int expected) {

	    Example1 checker = new Example1();

	    int result = 0;

	    try {
		result = checker.numOcString(s,strArr);
	    } catch (Exception exc) {
			System.out.println("\n*** Tester1 Error: returns exception\n"+exc.toString());
	    	
//		System.out.println("\n*** Tester1 Error: numOcString returns "+ result + " occurrences" +
//				 "\n instead of " + expected + " when searching the string " + s + "  in the array\n    " +
//				 printArray(strArr)+".\n\n");	    	
//		exc.printStackTrace();
//		System.out.println("\n");
		throw new Error("Error en test: resultado incorrecto");		
	    }
	    
	    if (result != expected) {
			System.out.println("\n*** Tester1 Error: numOcString returns "+ result + " occurrences" +
					 "\n instead of " + expected + " when searching the string " + s + "  in the array\n    " +
					 printArray(strArr)+".\n\n");
			throw new Error("Error en test: resultado incorrecto");		    
	    }
	}

    static String printArray(String[] arr) {
	StringBuffer result = new StringBuffer();
	result.append("[");
	for (int i=0; i<arr.length; i++) {
	    result.append(arr[i]);
	    if (i<arr.length-1)
		result.append(",");
	}
	result.append("]");
	return result.toString();
    }
}
