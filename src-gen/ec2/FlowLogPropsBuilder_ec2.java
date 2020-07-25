/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Log Props Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.FlowLogPropsBuilder_ec2#getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference <em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>}</li>
 *   <li>{@link ec2.FlowLogPropsBuilder_ec2#getFlowLogName_java_lang_String_ <em>Flow Log Name java lang String </em>}</li>
 *   <li>{@link ec2.FlowLogPropsBuilder_ec2#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference <em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>}</li>
 *   <li>{@link ec2.FlowLogPropsBuilder_ec2#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ <em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>}</li>
 *   <li>{@link ec2.FlowLogPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.FlowLogPropsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.FlowLogPropsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.FlowLogPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getFlowLogPropsBuilder_ec2()
 * @model
 * @generated
 */
public interface FlowLogPropsBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>' attribute.
	 * @see #setResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference(String)
	 * @see ec2.Ec2Package#getFlowLogPropsBuilder_ec2_ResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference()
	 * @model
	 * @generated
	 */
	String getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference();

	/**
	 * Sets the value of the '{@link ec2.FlowLogPropsBuilder_ec2#getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference <em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>' attribute.
	 * @see #getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference()
	 * @generated
	 */
	void setResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Flow Log Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Log Name java lang String </em>' attribute.
	 * @see #setFlowLogName_java_lang_String_(String)
	 * @see ec2.Ec2Package#getFlowLogPropsBuilder_ec2_FlowLogName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getFlowLogName_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.FlowLogPropsBuilder_ec2#getFlowLogName_java_lang_String_ <em>Flow Log Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Log Name java lang String </em>' attribute.
	 * @see #getFlowLogName_java_lang_String_()
	 * @generated
	 */
	void setFlowLogName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>' attribute.
	 * @see #setDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference(String)
	 * @see ec2.Ec2Package#getFlowLogPropsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference()
	 * @model
	 * @generated
	 */
	String getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference();

	/**
	 * Sets the value of the '{@link ec2.FlowLogPropsBuilder_ec2#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference <em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>' attribute.
	 * @see #getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference()
	 * @generated
	 */
	void setDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </b></em>' attribute.
	 * The literals are from the enumeration {@link ec2.FlowLogTrafficType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>' attribute.
	 * @see ec2.FlowLogTrafficType
	 * @see #setTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_(FlowLogTrafficType)
	 * @see ec2.Ec2Package#getFlowLogPropsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_()
	 * @model dataType="ec2.FlowLogTrafficType"
	 * @generated
	 */
	FlowLogTrafficType getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_();

	/**
	 * Sets the value of the '{@link ec2.FlowLogPropsBuilder_ec2#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ <em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>' attribute.
	 * @see ec2.FlowLogTrafficType
	 * @see #getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_()
	 * @generated
	 */
	void setTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_(FlowLogTrafficType value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.FlowLogProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getFlowLogPropsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.FlowLogProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getFlowLogPropsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.FlowLogPropsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getFlowLogPropsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.FlowLogPropsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getFlowLogPropsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.FlowLogPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // FlowLogPropsBuilder_ec2