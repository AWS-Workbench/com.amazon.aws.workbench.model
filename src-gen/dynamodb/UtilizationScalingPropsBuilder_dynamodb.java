/**
 */
package dynamodb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilization Scaling Props Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getTargetUtilizationPercent_java_lang_Number_ <em>Target Utilization Percent java lang Number </em>}</li>
 *   <li>{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getDisableScaleIn_java_lang_Boolean_ <em>Disable Scale In java lang Boolean </em>}</li>
 *   <li>{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getPolicyName_java_lang_String_ <em>Policy Name java lang String </em>}</li>
 *   <li>{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getVarName <em>Var Name</em>}</li>
 *   <li>{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see dynamodb.DynamodbPackage#getUtilizationScalingPropsBuilder_dynamodb()
 * @model
 * @generated
 */
public interface UtilizationScalingPropsBuilder_dynamodb extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Utilization Percent java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Utilization Percent java lang Number </em>' attribute.
	 * @see #setTargetUtilizationPercent_java_lang_Number_(int)
	 * @see dynamodb.DynamodbPackage#getUtilizationScalingPropsBuilder_dynamodb_TargetUtilizationPercent_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getTargetUtilizationPercent_java_lang_Number_();

	/**
	 * Sets the value of the '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getTargetUtilizationPercent_java_lang_Number_ <em>Target Utilization Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Utilization Percent java lang Number </em>' attribute.
	 * @see #getTargetUtilizationPercent_java_lang_Number_()
	 * @generated
	 */
	void setTargetUtilizationPercent_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Disable Scale In java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Scale In java lang Boolean </em>' attribute.
	 * @see #setDisableScaleIn_java_lang_Boolean_(Boolean)
	 * @see dynamodb.DynamodbPackage#getUtilizationScalingPropsBuilder_dynamodb_DisableScaleIn_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDisableScaleIn_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getDisableScaleIn_java_lang_Boolean_ <em>Disable Scale In java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Scale In java lang Boolean </em>' attribute.
	 * @see #getDisableScaleIn_java_lang_Boolean_()
	 * @generated
	 */
	void setDisableScaleIn_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Policy Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Name java lang String </em>' attribute.
	 * @see #setPolicyName_java_lang_String_(String)
	 * @see dynamodb.DynamodbPackage#getUtilizationScalingPropsBuilder_dynamodb_PolicyName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPolicyName_java_lang_String_();

	/**
	 * Sets the value of the '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getPolicyName_java_lang_String_ <em>Policy Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Name java lang String </em>' attribute.
	 * @see #getPolicyName_java_lang_String_()
	 * @generated
	 */
	void setPolicyName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see dynamodb.DynamodbPackage#getUtilizationScalingPropsBuilder_dynamodb_ScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale In Cooldown With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setScaleInCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see dynamodb.DynamodbPackage#getUtilizationScalingPropsBuilder_dynamodb_ScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Out Cooldown With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setScaleOutCooldownWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.dynamodb.UtilizationScalingProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see dynamodb.DynamodbPackage#getUtilizationScalingPropsBuilder_dynamodb_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.dynamodb.UtilizationScalingProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see dynamodb.DynamodbPackage#getUtilizationScalingPropsBuilder_dynamodb_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getVarName <em>Var Name</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getUtilizationScalingPropsBuilder_dynamodb_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getUtilizationScalingPropsBuilder_dynamodb_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link dynamodb.UtilizationScalingPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // UtilizationScalingPropsBuilder_dynamodb
