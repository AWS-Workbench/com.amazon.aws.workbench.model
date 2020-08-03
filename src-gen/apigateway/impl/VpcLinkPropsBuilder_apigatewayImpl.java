/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.VpcLinkPropsBuilder_apigateway;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vpc Link Props Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.VpcLinkPropsBuilder_apigatewayImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link apigateway.impl.VpcLinkPropsBuilder_apigatewayImpl#getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList <em>Targets software amazon awscdk services elasticloadbalancingv2 INetwork Load Balancer As List</em>}</li>
 *   <li>{@link apigateway.impl.VpcLinkPropsBuilder_apigatewayImpl#getVpcLinkName_java_lang_String_ <em>Vpc Link Name java lang String </em>}</li>
 *   <li>{@link apigateway.impl.VpcLinkPropsBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.VpcLinkPropsBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.VpcLinkPropsBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.VpcLinkPropsBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VpcLinkPropsBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements VpcLinkPropsBuilder_apigateway {
	/**
	 * The default value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String description_java_lang_String_ = DESCRIPTION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList() <em>Targets software amazon awscdk services elasticloadbalancingv2 INetwork Load Balancer As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList() <em>Targets software amazon awscdk services elasticloadbalancingv2 INetwork Load Balancer As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList()
	 * @generated
	 * @ordered
	 */
	protected String targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList = TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcLinkName_java_lang_String_() <em>Vpc Link Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcLinkName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_LINK_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcLinkName_java_lang_String_() <em>Vpc Link Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcLinkName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String vpcLinkName_java_lang_String_ = VPC_LINK_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.VpcLinkProps";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VpcLinkPropsBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.VPC_LINK_PROPS_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription_java_lang_String_() {
		return description_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription_java_lang_String_(String newDescription_java_lang_String_) {
		String oldDescription_java_lang_String_ = description_java_lang_String_;
		description_java_lang_String_ = newDescription_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList() {
		return targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList(
			String newTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList) {
		String oldTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList = targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList;
		targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList = newTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST,
					oldTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList,
					targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcLinkName_java_lang_String_() {
		return vpcLinkName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcLinkName_java_lang_String_(String newVpcLinkName_java_lang_String_) {
		String oldVpcLinkName_java_lang_String_ = vpcLinkName_java_lang_String_;
		vpcLinkName_java_lang_String_ = newVpcLinkName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__VPC_LINK_NAME_JAVA_LANG_STRING_,
					oldVpcLinkName_java_lang_String_, vpcLinkName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST:
			return getTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList();
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__VPC_LINK_NAME_JAVA_LANG_STRING_:
			return getVpcLinkName_java_lang_String_();
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST:
			setTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList(
					(String) newValue);
			return;
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__VPC_LINK_NAME_JAVA_LANG_STRING_:
			setVpcLinkName_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST:
			setTargets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList(
					TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__VPC_LINK_NAME_JAVA_LANG_STRING_:
			setVpcLinkName_java_lang_String_(VPC_LINK_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST:
			return TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST_EDEFAULT == null
					? targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList != null
					: !TARGETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ELASTICLOADBALANCINGV2_INETWORK_LOAD_BALANCER_AS_LIST_EDEFAULT
							.equals(targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList);
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__VPC_LINK_NAME_JAVA_LANG_STRING_:
			return VPC_LINK_NAME_JAVA_LANG_STRING__EDEFAULT == null ? vpcLinkName_java_lang_String_ != null
					: !VPC_LINK_NAME_JAVA_LANG_STRING__EDEFAULT.equals(vpcLinkName_java_lang_String_);
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.VPC_LINK_PROPS_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList: ");
		result.append(targets_software_amazon_awscdk_services_elasticloadbalancingv2_INetworkLoadBalancer_AsList);
		result.append(", vpcLinkName_java_lang_String_: ");
		result.append(vpcLinkName_java_lang_String_);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //VpcLinkPropsBuilder_apigatewayImpl
