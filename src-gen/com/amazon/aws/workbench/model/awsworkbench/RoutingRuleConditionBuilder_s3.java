/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routing Rule Condition Builder s3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getHttpErrorCodeReturnedEquals_java_lang_String_ <em>Http Error Code Returned Equals java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getKeyPrefixEquals_java_lang_String_ <em>Key Prefix Equals java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRoutingRuleConditionBuilder_s3()
 * @model
 * @generated
 */
public interface RoutingRuleConditionBuilder_s3 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Http Error Code Returned Equals java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Error Code Returned Equals java lang String </em>' attribute.
	 * @see #setHttpErrorCodeReturnedEquals_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRoutingRuleConditionBuilder_s3_HttpErrorCodeReturnedEquals_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getHttpErrorCodeReturnedEquals_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getHttpErrorCodeReturnedEquals_java_lang_String_ <em>Http Error Code Returned Equals java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Error Code Returned Equals java lang String </em>' attribute.
	 * @see #getHttpErrorCodeReturnedEquals_java_lang_String_()
	 * @generated
	 */
	void setHttpErrorCodeReturnedEquals_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Key Prefix Equals java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Prefix Equals java lang String </em>' attribute.
	 * @see #setKeyPrefixEquals_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRoutingRuleConditionBuilder_s3_KeyPrefixEquals_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getKeyPrefixEquals_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getKeyPrefixEquals_java_lang_String_ <em>Key Prefix Equals java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Prefix Equals java lang String </em>' attribute.
	 * @see #getKeyPrefixEquals_java_lang_String_()
	 * @generated
	 */
	void setKeyPrefixEquals_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.s3.RoutingRuleCondition"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRoutingRuleConditionBuilder_s3_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.s3.RoutingRuleCondition" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRoutingRuleConditionBuilder_s3_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRoutingRuleConditionBuilder_s3_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getRoutingRuleConditionBuilder_s3_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.RoutingRuleConditionBuilder_s3#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // RoutingRuleConditionBuilder_s3
