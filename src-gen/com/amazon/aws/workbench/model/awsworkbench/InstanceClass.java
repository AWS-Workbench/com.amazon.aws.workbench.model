/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instance Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getInstanceClass()
 * @model instanceClass="com.amazon.aws.workbench.model.awsworkbench.InstanceClass"
 * @generated
 */
public enum InstanceClass implements Enumerator {
	/**
	 * The '<em><b>STANDARD3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD3_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD3(0, "STANDARD3", "STANDARD3"),

	/**
	 * The '<em><b>STANDARD4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD4_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD4(1, "STANDARD4", "STANDARD4"),

	/**
	 * The '<em><b>STANDARD5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD5_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD5(2, "STANDARD5", "STANDARD5"),

	/**
	 * The '<em><b>STANDARD5 NVME DRIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD5_NVME_DRIVE_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD5_NVME_DRIVE(3, "STANDARD5_NVME_DRIVE", "STANDARD5_NVME_DRIVE"),

	/**
	 * The '<em><b>STANDARD5 AMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD5_AMD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD5_AMD(4, "STANDARD5_AMD", "STANDARD5_AMD"),

	/**
	 * The '<em><b>STANDARD5 AMD NVME DRIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD5_AMD_NVME_DRIVE_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD5_AMD_NVME_DRIVE(5, "STANDARD5_AMD_NVME_DRIVE", "STANDARD5_AMD_NVME_DRIVE"),

	/**
	 * The '<em><b>MEMORY3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY3_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY3(6, "MEMORY3", "MEMORY3"),

	/**
	 * The '<em><b>MEMORY4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY4_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY4(7, "MEMORY4", "MEMORY4"),

	/**
	 * The '<em><b>MEMORY5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY5_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY5(8, "MEMORY5", "MEMORY5"),

	/**
	 * The '<em><b>MEMORY5 HIGH PERFORMANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY5_HIGH_PERFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY5_HIGH_PERFORMANCE(9, "MEMORY5_HIGH_PERFORMANCE", "MEMORY5_HIGH_PERFORMANCE"),

	/**
	 * The '<em><b>MEMORY5 NVME DRIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY5_NVME_DRIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY5_NVME_DRIVE(10, "MEMORY5_NVME_DRIVE", "MEMORY5_NVME_DRIVE"),

	/**
	 * The '<em><b>MEMORY5 NVME DRIVE HIGH PERFORMANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE(11, "MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE",
			"MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE"),

	/**
	 * The '<em><b>MEMORY5 AMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY5_AMD_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY5_AMD(12, "MEMORY5_AMD", "MEMORY5_AMD"),

	/**
	 * The '<em><b>COMPUTE3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTE3_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTE3(13, "COMPUTE3", "COMPUTE3"),

	/**
	 * The '<em><b>COMPUTE4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTE4_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTE4(14, "COMPUTE4", "COMPUTE4"),

	/**
	 * The '<em><b>COMPUTE5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTE5_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTE5(15, "COMPUTE5", "COMPUTE5"),

	/**
	 * The '<em><b>COMPUTE5 NVME DRIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTE5_NVME_DRIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTE5_NVME_DRIVE(16, "COMPUTE5_NVME_DRIVE", "COMPUTE5_NVME_DRIVE"),

	/**
	 * The '<em><b>COMPUTE5 HIGH PERFORMANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTE5_HIGH_PERFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTE5_HIGH_PERFORMANCE(17, "COMPUTE5_HIGH_PERFORMANCE", "COMPUTE5_HIGH_PERFORMANCE"),

	/**
	 * The '<em><b>STORAGE2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE2_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE2(18, "STORAGE2", "STORAGE2"),

	/**
	 * The '<em><b>STORAGE COMPUTE 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_COMPUTE_1_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE_COMPUTE_1(19, "STORAGE_COMPUTE_1", "STORAGE_COMPUTE_1"),

	/**
	 * The '<em><b>IO3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO3_VALUE
	 * @generated
	 * @ordered
	 */
	IO3(20, "IO3", "IO3"),

	/**
	 * The '<em><b>IO3 DENSE NVME DRIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO3_DENSE_NVME_DRIVE_VALUE
	 * @generated
	 * @ordered
	 */
	IO3_DENSE_NVME_DRIVE(21, "IO3_DENSE_NVME_DRIVE", "IO3_DENSE_NVME_DRIVE"),

	/**
	 * The '<em><b>BURSTABLE2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURSTABLE2_VALUE
	 * @generated
	 * @ordered
	 */
	BURSTABLE2(22, "BURSTABLE2", "BURSTABLE2"),

	/**
	 * The '<em><b>BURSTABLE3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURSTABLE3_VALUE
	 * @generated
	 * @ordered
	 */
	BURSTABLE3(23, "BURSTABLE3", "BURSTABLE3"),

	/**
	 * The '<em><b>BURSTABLE3 AMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURSTABLE3_AMD_VALUE
	 * @generated
	 * @ordered
	 */
	BURSTABLE3_AMD(24, "BURSTABLE3_AMD", "BURSTABLE3_AMD"),

	/**
	 * The '<em><b>MEMORY INTENSIVE 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_INTENSIVE_1_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_INTENSIVE_1(25, "MEMORY_INTENSIVE_1", "MEMORY_INTENSIVE_1"),

	/**
	 * The '<em><b>MEMORY INTENSIVE 1EXTENDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_INTENSIVE_1EXTENDED_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_INTENSIVE_1EXTENDED(26, "MEMORY_INTENSIVE_1_EXTENDED", "MEMORY_INTENSIVE_1_EXTENDED"),

	/**
	 * The '<em><b>FPGA1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FPGA1_VALUE
	 * @generated
	 * @ordered
	 */
	FPGA1(27, "FPGA1", "FPGA1"),

	/**
	 * The '<em><b>GRAPHICS3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHICS3_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHICS3(28, "GRAPHICS3", "GRAPHICS3"),

	/**
	 * The '<em><b>GRAPHICS4 NVME DRIVE HIGH PERFORMANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE(29, "GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE",
			"GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE"),

	/**
	 * The '<em><b>PARALLEL2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL2_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL2(30, "PARALLEL2", "PARALLEL2"),

	/**
	 * The '<em><b>PARALLEL3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL3_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL3(31, "PARALLEL3", "PARALLEL3"),

	/**
	 * The '<em><b>ARM1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARM1_VALUE
	 * @generated
	 * @ordered
	 */
	ARM1(32, "ARM1", "ARM1"),

	/**
	 * The '<em><b>STANDARD6 GRAVITON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD6_GRAVITON_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD6_GRAVITON(33, "STANDARD6_GRAVITON", "STANDARD6_GRAVITON"),

	/**
	 * The '<em><b>HIGH COMPUTE MEMORY1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_COMPUTE_MEMORY1_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_COMPUTE_MEMORY1(34, "HIGH_COMPUTE_MEMORY1", "HIGH_COMPUTE_MEMORY1"),

	/**
	 * The '<em><b>INFERENCE1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFERENCE1_VALUE
	 * @generated
	 * @ordered
	 */
	INFERENCE1(35, "INFERENCE1", "INFERENCE1");

	/**
	 * The '<em><b>STANDARD3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD3_VALUE = 0;

	/**
	 * The '<em><b>STANDARD4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD4_VALUE = 1;

	/**
	 * The '<em><b>STANDARD5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD5_VALUE = 2;

	/**
	 * The '<em><b>STANDARD5 NVME DRIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD5_NVME_DRIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD5_NVME_DRIVE_VALUE = 3;

	/**
	 * The '<em><b>STANDARD5 AMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD5_AMD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD5_AMD_VALUE = 4;

	/**
	 * The '<em><b>STANDARD5 AMD NVME DRIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD5_AMD_NVME_DRIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD5_AMD_NVME_DRIVE_VALUE = 5;

	/**
	 * The '<em><b>MEMORY3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY3_VALUE = 6;

	/**
	 * The '<em><b>MEMORY4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY4_VALUE = 7;

	/**
	 * The '<em><b>MEMORY5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY5_VALUE = 8;

	/**
	 * The '<em><b>MEMORY5 HIGH PERFORMANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY5_HIGH_PERFORMANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY5_HIGH_PERFORMANCE_VALUE = 9;

	/**
	 * The '<em><b>MEMORY5 NVME DRIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY5_NVME_DRIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY5_NVME_DRIVE_VALUE = 10;

	/**
	 * The '<em><b>MEMORY5 NVME DRIVE HIGH PERFORMANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE_VALUE = 11;

	/**
	 * The '<em><b>MEMORY5 AMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY5_AMD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY5_AMD_VALUE = 12;

	/**
	 * The '<em><b>COMPUTE3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTE3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTE3_VALUE = 13;

	/**
	 * The '<em><b>COMPUTE4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTE4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTE4_VALUE = 14;

	/**
	 * The '<em><b>COMPUTE5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTE5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTE5_VALUE = 15;

	/**
	 * The '<em><b>COMPUTE5 NVME DRIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTE5_NVME_DRIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTE5_NVME_DRIVE_VALUE = 16;

	/**
	 * The '<em><b>COMPUTE5 HIGH PERFORMANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTE5_HIGH_PERFORMANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTE5_HIGH_PERFORMANCE_VALUE = 17;

	/**
	 * The '<em><b>STORAGE2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE2_VALUE = 18;

	/**
	 * The '<em><b>STORAGE COMPUTE 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_COMPUTE_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_COMPUTE_1_VALUE = 19;

	/**
	 * The '<em><b>IO3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IO3_VALUE = 20;

	/**
	 * The '<em><b>IO3 DENSE NVME DRIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO3_DENSE_NVME_DRIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IO3_DENSE_NVME_DRIVE_VALUE = 21;

	/**
	 * The '<em><b>BURSTABLE2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURSTABLE2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BURSTABLE2_VALUE = 22;

	/**
	 * The '<em><b>BURSTABLE3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURSTABLE3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BURSTABLE3_VALUE = 23;

	/**
	 * The '<em><b>BURSTABLE3 AMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURSTABLE3_AMD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BURSTABLE3_AMD_VALUE = 24;

	/**
	 * The '<em><b>MEMORY INTENSIVE 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_INTENSIVE_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_INTENSIVE_1_VALUE = 25;

	/**
	 * The '<em><b>MEMORY INTENSIVE 1EXTENDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_INTENSIVE_1EXTENDED
	 * @model name="MEMORY_INTENSIVE_1_EXTENDED"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_INTENSIVE_1EXTENDED_VALUE = 26;

	/**
	 * The '<em><b>FPGA1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FPGA1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FPGA1_VALUE = 27;

	/**
	 * The '<em><b>GRAPHICS3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHICS3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHICS3_VALUE = 28;

	/**
	 * The '<em><b>GRAPHICS4 NVME DRIVE HIGH PERFORMANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE_VALUE = 29;

	/**
	 * The '<em><b>PARALLEL2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL2_VALUE = 30;

	/**
	 * The '<em><b>PARALLEL3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL3_VALUE = 31;

	/**
	 * The '<em><b>ARM1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARM1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARM1_VALUE = 32;

	/**
	 * The '<em><b>STANDARD6 GRAVITON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD6_GRAVITON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD6_GRAVITON_VALUE = 33;

	/**
	 * The '<em><b>HIGH COMPUTE MEMORY1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_COMPUTE_MEMORY1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_COMPUTE_MEMORY1_VALUE = 34;

	/**
	 * The '<em><b>INFERENCE1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFERENCE1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFERENCE1_VALUE = 35;

	/**
	 * An array of all the '<em><b>Instance Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InstanceClass[] VALUES_ARRAY = new InstanceClass[] { STANDARD3, STANDARD4, STANDARD5,
			STANDARD5_NVME_DRIVE, STANDARD5_AMD, STANDARD5_AMD_NVME_DRIVE, MEMORY3, MEMORY4, MEMORY5,
			MEMORY5_HIGH_PERFORMANCE, MEMORY5_NVME_DRIVE, MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE, MEMORY5_AMD, COMPUTE3,
			COMPUTE4, COMPUTE5, COMPUTE5_NVME_DRIVE, COMPUTE5_HIGH_PERFORMANCE, STORAGE2, STORAGE_COMPUTE_1, IO3,
			IO3_DENSE_NVME_DRIVE, BURSTABLE2, BURSTABLE3, BURSTABLE3_AMD, MEMORY_INTENSIVE_1,
			MEMORY_INTENSIVE_1EXTENDED, FPGA1, GRAPHICS3, GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE, PARALLEL2, PARALLEL3,
			ARM1, STANDARD6_GRAVITON, HIGH_COMPUTE_MEMORY1, INFERENCE1, };

	/**
	 * A public read-only list of all the '<em><b>Instance Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InstanceClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instance Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceClass get(int value) {
		switch (value) {
		case STANDARD3_VALUE:
			return STANDARD3;
		case STANDARD4_VALUE:
			return STANDARD4;
		case STANDARD5_VALUE:
			return STANDARD5;
		case STANDARD5_NVME_DRIVE_VALUE:
			return STANDARD5_NVME_DRIVE;
		case STANDARD5_AMD_VALUE:
			return STANDARD5_AMD;
		case STANDARD5_AMD_NVME_DRIVE_VALUE:
			return STANDARD5_AMD_NVME_DRIVE;
		case MEMORY3_VALUE:
			return MEMORY3;
		case MEMORY4_VALUE:
			return MEMORY4;
		case MEMORY5_VALUE:
			return MEMORY5;
		case MEMORY5_HIGH_PERFORMANCE_VALUE:
			return MEMORY5_HIGH_PERFORMANCE;
		case MEMORY5_NVME_DRIVE_VALUE:
			return MEMORY5_NVME_DRIVE;
		case MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE_VALUE:
			return MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE;
		case MEMORY5_AMD_VALUE:
			return MEMORY5_AMD;
		case COMPUTE3_VALUE:
			return COMPUTE3;
		case COMPUTE4_VALUE:
			return COMPUTE4;
		case COMPUTE5_VALUE:
			return COMPUTE5;
		case COMPUTE5_NVME_DRIVE_VALUE:
			return COMPUTE5_NVME_DRIVE;
		case COMPUTE5_HIGH_PERFORMANCE_VALUE:
			return COMPUTE5_HIGH_PERFORMANCE;
		case STORAGE2_VALUE:
			return STORAGE2;
		case STORAGE_COMPUTE_1_VALUE:
			return STORAGE_COMPUTE_1;
		case IO3_VALUE:
			return IO3;
		case IO3_DENSE_NVME_DRIVE_VALUE:
			return IO3_DENSE_NVME_DRIVE;
		case BURSTABLE2_VALUE:
			return BURSTABLE2;
		case BURSTABLE3_VALUE:
			return BURSTABLE3;
		case BURSTABLE3_AMD_VALUE:
			return BURSTABLE3_AMD;
		case MEMORY_INTENSIVE_1_VALUE:
			return MEMORY_INTENSIVE_1;
		case MEMORY_INTENSIVE_1EXTENDED_VALUE:
			return MEMORY_INTENSIVE_1EXTENDED;
		case FPGA1_VALUE:
			return FPGA1;
		case GRAPHICS3_VALUE:
			return GRAPHICS3;
		case GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE_VALUE:
			return GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE;
		case PARALLEL2_VALUE:
			return PARALLEL2;
		case PARALLEL3_VALUE:
			return PARALLEL3;
		case ARM1_VALUE:
			return ARM1;
		case STANDARD6_GRAVITON_VALUE:
			return STANDARD6_GRAVITON;
		case HIGH_COMPUTE_MEMORY1_VALUE:
			return HIGH_COMPUTE_MEMORY1;
		case INFERENCE1_VALUE:
			return INFERENCE1;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InstanceClass(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //InstanceClass
