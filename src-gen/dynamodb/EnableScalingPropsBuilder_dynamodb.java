/**
 */
package dynamodb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enable Scaling Props Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getMaxCapacity_java_lang_Number_ <em>Max Capacity java lang Number </em>}</li>
 *   <li>{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getMinCapacity_java_lang_Number_ <em>Min Capacity java lang Number </em>}</li>
 *   <li>{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getVarName <em>Var Name</em>}</li>
 *   <li>{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see dynamodb.DynamodbPackage#getEnableScalingPropsBuilder_dynamodb()
 * @model
 * @generated
 */
public interface EnableScalingPropsBuilder_dynamodb extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Capacity java lang Number </em>' attribute.
	 * @see #setMaxCapacity_java_lang_Number_(int)
	 * @see dynamodb.DynamodbPackage#getEnableScalingPropsBuilder_dynamodb_MaxCapacity_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxCapacity_java_lang_Number_();

	/**
	 * Sets the value of the '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getMaxCapacity_java_lang_Number_ <em>Max Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Capacity java lang Number </em>' attribute.
	 * @see #getMaxCapacity_java_lang_Number_()
	 * @generated
	 */
	void setMaxCapacity_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Min Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Capacity java lang Number </em>' attribute.
	 * @see #setMinCapacity_java_lang_Number_(int)
	 * @see dynamodb.DynamodbPackage#getEnableScalingPropsBuilder_dynamodb_MinCapacity_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMinCapacity_java_lang_Number_();

	/**
	 * Sets the value of the '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getMinCapacity_java_lang_Number_ <em>Min Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Capacity java lang Number </em>' attribute.
	 * @see #getMinCapacity_java_lang_Number_()
	 * @generated
	 */
	void setMinCapacity_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.dynamodb.EnableScalingProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see dynamodb.DynamodbPackage#getEnableScalingPropsBuilder_dynamodb_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.dynamodb.EnableScalingProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see dynamodb.DynamodbPackage#getEnableScalingPropsBuilder_dynamodb_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getVarName <em>Var Name</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getEnableScalingPropsBuilder_dynamodb_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getEnableScalingPropsBuilder_dynamodb_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link dynamodb.EnableScalingPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // EnableScalingPropsBuilder_dynamodb
