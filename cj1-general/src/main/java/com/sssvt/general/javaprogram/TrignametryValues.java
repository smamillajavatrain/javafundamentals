//69.	W A P FOR evaluates the SIN (TETA) series up to by given “TETA” value in degree?
//          Sin (), cos (), tan (), cot (), ::all degrees[0, 30,  45, 60, 90].  

package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class TrignametryValues {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		int tan_0;
		double tan_30;
		double tan_45;
		double tan_60;
		int tan_90;
		int cot_0;
		double cot_30;
		double cot_45;
		double cot_60;
		int cot_90;

		tan_0 = TriganametryConstentValues.SINE_0 / TriganametryConstentValues.COS_0;
		System.out.println("tan_0 = " + tan_0);
		tan_30 = TriganametryConstentValues.SINE_30 / TriganametryConstentValues.COS_30;
		System.out.println("tan_30 = " + tan_30);
		tan_45 = TriganametryConstentValues.SINE_45 / TriganametryConstentValues.COS_45;
		System.out.println("tan_45 = " + tan_45);
		tan_60 = TriganametryConstentValues.SINE_60 / TriganametryConstentValues.COS_60;
		System.out.println("tan_60 = " + tan_60);
		// tan_90=TriganametryConstentValues.SINE_90/TriganametryConstentValues.COS_90;
		// System.out.println("tan_90 = "+tan_90);
		// cot_0=TriganametryConstentValues.COS_0/TriganametryConstentValues.SINE_0;
		// System.out.println("cot_0 = "+cot_0);
		cot_30 = TriganametryConstentValues.COS_30 / TriganametryConstentValues.SINE_30;
		System.out.println("cot_30 = " + cot_30);
		cot_45 = TriganametryConstentValues.COS_45 / TriganametryConstentValues.SINE_45;
		System.out.println("cot_45 = " + cot_45);
		cot_60 = TriganametryConstentValues.COS_60 / TriganametryConstentValues.SINE_60;
		System.out.println("cot_60 = " + cot_60);
		cot_90 = TriganametryConstentValues.COS_90 / TriganametryConstentValues.SINE_90;
		System.out.println("cot_90 = " + cot_90);

	}

}
