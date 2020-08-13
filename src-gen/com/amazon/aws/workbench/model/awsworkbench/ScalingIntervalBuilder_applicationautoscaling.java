/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Interval Builder applicationautoscaling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getChange_java_lang_Number_ <em>Change java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getLower_java_lang_Number_ <em>Lower java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getUpper_java_lang_Number_ <em>Upper java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScalingIntervalBuilder_applicationautoscaling()
 * @model
 * @generated
 */
public interface ScalingIntervalBuilder_applicationautoscaling extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Change java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change java lang Number </em>' attribute.
	 * @see #setChange_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScalingIntervalBuilder_applicationautoscaling_Change_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getChange_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getChange_java_lang_Number_ <em>Change java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change java lang Number </em>' attribute.
	 * @see #getChange_java_lang_Number_()
	 * @generated
	 */
	void setChange_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Lower java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower java lang Number </em>' attribute.
	 * @see #setLower_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScalingIntervalBuilder_applicationautoscaling_Lower_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getLower_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getLower_java_lang_Number_ <em>Lower java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower java lang Number </em>' attribute.
	 * @see #getLower_java_lang_Number_()
	 * @generated
	 */
	void setLower_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Upper java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper java lang Number </em>' attribute.
	 * @see #setUpper_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScalingIntervalBuilder_applicationautoscaling_Upper_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getUpper_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getUpper_java_lang_Number_ <em>Upper java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper java lang Number </em>' attribute.
	 * @see #getUpper_java_lang_Number_()
	 * @generated
	 */
	void setUpper_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.applicationautoscaling.ScalingInterval"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScalingIntervalBuilder_applicationautoscaling_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.applicationautoscaling.ScalingInterval" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScalingIntervalBuilder_applicationautoscaling_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScalingIntervalBuilder_applicationautoscaling_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScalingIntervalBuilder_applicationautoscaling_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScalingIntervalBuilder_applicationautoscaling#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ScalingIntervalBuilder_applicationautoscaling
