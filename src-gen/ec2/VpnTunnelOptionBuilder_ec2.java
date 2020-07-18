/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vpn Tunnel Option Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.VpnTunnelOptionBuilder_ec2#getPreSharedKey_java_lang_String_ <em>Pre Shared Key java lang String </em>}</li>
 *   <li>{@link ec2.VpnTunnelOptionBuilder_ec2#getTunnelInsideCidr_java_lang_String_ <em>Tunnel Inside Cidr java lang String </em>}</li>
 *   <li>{@link ec2.VpnTunnelOptionBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.VpnTunnelOptionBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.VpnTunnelOptionBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.VpnTunnelOptionBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getVpnTunnelOptionBuilder_ec2()
 * @model
 * @generated
 */
public interface VpnTunnelOptionBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre Shared Key java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Shared Key java lang String </em>' attribute.
	 * @see #setPreSharedKey_java_lang_String_(String)
	 * @see ec2.Ec2Package#getVpnTunnelOptionBuilder_ec2_PreSharedKey_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPreSharedKey_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.VpnTunnelOptionBuilder_ec2#getPreSharedKey_java_lang_String_ <em>Pre Shared Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Shared Key java lang String </em>' attribute.
	 * @see #getPreSharedKey_java_lang_String_()
	 * @generated
	 */
	void setPreSharedKey_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Tunnel Inside Cidr java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tunnel Inside Cidr java lang String </em>' attribute.
	 * @see #setTunnelInsideCidr_java_lang_String_(String)
	 * @see ec2.Ec2Package#getVpnTunnelOptionBuilder_ec2_TunnelInsideCidr_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getTunnelInsideCidr_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.VpnTunnelOptionBuilder_ec2#getTunnelInsideCidr_java_lang_String_ <em>Tunnel Inside Cidr java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tunnel Inside Cidr java lang String </em>' attribute.
	 * @see #getTunnelInsideCidr_java_lang_String_()
	 * @generated
	 */
	void setTunnelInsideCidr_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.VpnTunnelOption"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getVpnTunnelOptionBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.VpnTunnelOption" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getVpnTunnelOptionBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.VpnTunnelOptionBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getVpnTunnelOptionBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.VpnTunnelOptionBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getVpnTunnelOptionBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.VpnTunnelOptionBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // VpnTunnelOptionBuilder_ec2
