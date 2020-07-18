/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Rule Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.ConnectionRuleBuilder_ec2#getFromPort_java_lang_Number_ <em>From Port java lang Number </em>}</li>
 *   <li>{@link ec2.ConnectionRuleBuilder_ec2#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link ec2.ConnectionRuleBuilder_ec2#getProtocol_java_lang_String_ <em>Protocol java lang String </em>}</li>
 *   <li>{@link ec2.ConnectionRuleBuilder_ec2#getToPort_java_lang_Number_ <em>To Port java lang Number </em>}</li>
 *   <li>{@link ec2.ConnectionRuleBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.ConnectionRuleBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.ConnectionRuleBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.ConnectionRuleBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getConnectionRuleBuilder_ec2()
 * @model
 * @generated
 */
public interface ConnectionRuleBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>From Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Port java lang Number </em>' attribute.
	 * @see #setFromPort_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getConnectionRuleBuilder_ec2_FromPort_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getFromPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.ConnectionRuleBuilder_ec2#getFromPort_java_lang_Number_ <em>From Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port java lang Number </em>' attribute.
	 * @see #getFromPort_java_lang_Number_()
	 * @generated
	 */
	void setFromPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see ec2.Ec2Package#getConnectionRuleBuilder_ec2_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.ConnectionRuleBuilder_ec2#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Protocol java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol java lang String </em>' attribute.
	 * @see #setProtocol_java_lang_String_(String)
	 * @see ec2.Ec2Package#getConnectionRuleBuilder_ec2_Protocol_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getProtocol_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.ConnectionRuleBuilder_ec2#getProtocol_java_lang_String_ <em>Protocol java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol java lang String </em>' attribute.
	 * @see #getProtocol_java_lang_String_()
	 * @generated
	 */
	void setProtocol_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>To Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Port java lang Number </em>' attribute.
	 * @see #setToPort_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getConnectionRuleBuilder_ec2_ToPort_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getToPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.ConnectionRuleBuilder_ec2#getToPort_java_lang_Number_ <em>To Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port java lang Number </em>' attribute.
	 * @see #getToPort_java_lang_Number_()
	 * @generated
	 */
	void setToPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.ConnectionRule"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getConnectionRuleBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.ConnectionRule" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getConnectionRuleBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.ConnectionRuleBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getConnectionRuleBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.ConnectionRuleBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getConnectionRuleBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.ConnectionRuleBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ConnectionRuleBuilder_ec2
