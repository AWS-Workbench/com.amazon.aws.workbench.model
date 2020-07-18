/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.PortBuilder_ec2#getProtocol_software_amazon_awscdk_services_ec2_Protocol_ <em>Protocol software amazon awscdk services ec2 Protocol </em>}</li>
 *   <li>{@link ec2.PortBuilder_ec2#getStringRepresentation_java_lang_String_ <em>String Representation java lang String </em>}</li>
 *   <li>{@link ec2.PortBuilder_ec2#getFromPort_java_lang_Number_ <em>From Port java lang Number </em>}</li>
 *   <li>{@link ec2.PortBuilder_ec2#getToPort_java_lang_Number_ <em>To Port java lang Number </em>}</li>
 *   <li>{@link ec2.PortBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.PortBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.PortBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.PortBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getPortBuilder_ec2()
 * @model
 * @generated
 */
public interface PortBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol software amazon awscdk services ec2 Protocol </b></em>' attribute.
	 * The literals are from the enumeration {@link ec2.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol software amazon awscdk services ec2 Protocol </em>' attribute.
	 * @see ec2.Protocol
	 * @see #setProtocol_software_amazon_awscdk_services_ec2_Protocol_(Protocol)
	 * @see ec2.Ec2Package#getPortBuilder_ec2_Protocol_software_amazon_awscdk_services_ec2_Protocol_()
	 * @model dataType="ec2.Protocol"
	 * @generated
	 */
	Protocol getProtocol_software_amazon_awscdk_services_ec2_Protocol_();

	/**
	 * Sets the value of the '{@link ec2.PortBuilder_ec2#getProtocol_software_amazon_awscdk_services_ec2_Protocol_ <em>Protocol software amazon awscdk services ec2 Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol software amazon awscdk services ec2 Protocol </em>' attribute.
	 * @see ec2.Protocol
	 * @see #getProtocol_software_amazon_awscdk_services_ec2_Protocol_()
	 * @generated
	 */
	void setProtocol_software_amazon_awscdk_services_ec2_Protocol_(Protocol value);

	/**
	 * Returns the value of the '<em><b>String Representation java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Representation java lang String </em>' attribute.
	 * @see #setStringRepresentation_java_lang_String_(String)
	 * @see ec2.Ec2Package#getPortBuilder_ec2_StringRepresentation_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getStringRepresentation_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.PortBuilder_ec2#getStringRepresentation_java_lang_String_ <em>String Representation java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Representation java lang String </em>' attribute.
	 * @see #getStringRepresentation_java_lang_String_()
	 * @generated
	 */
	void setStringRepresentation_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>From Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Port java lang Number </em>' attribute.
	 * @see #setFromPort_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getPortBuilder_ec2_FromPort_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getFromPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.PortBuilder_ec2#getFromPort_java_lang_Number_ <em>From Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port java lang Number </em>' attribute.
	 * @see #getFromPort_java_lang_Number_()
	 * @generated
	 */
	void setFromPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>To Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Port java lang Number </em>' attribute.
	 * @see #setToPort_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getPortBuilder_ec2_ToPort_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getToPort_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.PortBuilder_ec2#getToPort_java_lang_Number_ <em>To Port java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port java lang Number </em>' attribute.
	 * @see #getToPort_java_lang_Number_()
	 * @generated
	 */
	void setToPort_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.Port"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getPortBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.Port" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getPortBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.PortBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getPortBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.PortBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getPortBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.PortBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // PortBuilder_ec2
