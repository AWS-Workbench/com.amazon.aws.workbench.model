/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connections Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.ConnectionsBuilder_ec2#getDefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference <em>Default Port With Port software amazon awscdk services ec2 Port As Reference</em>}</li>
 *   <li>{@link ec2.ConnectionsBuilder_ec2#getPeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference <em>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</em>}</li>
 *   <li>{@link ec2.ConnectionsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}</li>
 *   <li>{@link ec2.ConnectionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.ConnectionsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.ConnectionsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.ConnectionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getConnectionsBuilder_ec2()
 * @model
 * @generated
 */
public interface ConnectionsBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Port With Port software amazon awscdk services ec2 Port As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Port With Port software amazon awscdk services ec2 Port As Reference</em>' attribute.
	 * @see #setDefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference(String)
	 * @see ec2.Ec2Package#getConnectionsBuilder_ec2_DefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference()
	 * @model
	 * @generated
	 */
	String getDefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference();

	/**
	 * Sets the value of the '{@link ec2.ConnectionsBuilder_ec2#getDefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference <em>Default Port With Port software amazon awscdk services ec2 Port As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Port With Port software amazon awscdk services ec2 Port As Reference</em>' attribute.
	 * @see #getDefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference()
	 * @generated
	 */
	void setDefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</em>' attribute.
	 * @see #setPeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference(String)
	 * @see ec2.Ec2Package#getConnectionsBuilder_ec2_PeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference()
	 * @model
	 * @generated
	 */
	String getPeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference();

	/**
	 * Sets the value of the '{@link ec2.ConnectionsBuilder_ec2#getPeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference <em>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</em>' attribute.
	 * @see #getPeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference()
	 * @generated
	 */
	void setPeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>' attribute.
	 * @see #setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(String)
	 * @see ec2.Ec2Package#getConnectionsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @model
	 * @generated
	 */
	String getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

	/**
	 * Sets the value of the '{@link ec2.ConnectionsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>' attribute.
	 * @see #getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @generated
	 */
	void setSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.Connections"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getConnectionsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.Connections" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getConnectionsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.ConnectionsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getConnectionsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.ConnectionsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getConnectionsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.ConnectionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ConnectionsBuilder_ec2
