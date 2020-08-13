/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.HostedZoneBuilder_route53;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hosted Zone Builder route53</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HostedZoneBuilder_route53Impl#getZoneName_java_lang_String_ <em>Zone Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HostedZoneBuilder_route53Impl#getComment_java_lang_String_ <em>Comment java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HostedZoneBuilder_route53Impl#getQueryLogsLogGroupArn_java_lang_String_ <em>Query Logs Log Group Arn java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HostedZoneBuilder_route53Impl#getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList <em>Vpcs software amazon awscdk services ec2 IVpc As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HostedZoneBuilder_route53Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HostedZoneBuilder_route53Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HostedZoneBuilder_route53Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.HostedZoneBuilder_route53Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostedZoneBuilder_route53Impl extends ServiceResourcesImpl implements HostedZoneBuilder_route53 {
	/**
	 * The default value of the '{@link #getZoneName_java_lang_String_() <em>Zone Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoneName_java_lang_String_() <em>Zone Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String zoneName_java_lang_String_ = ZONE_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getComment_java_lang_String_() <em>Comment java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment_java_lang_String_() <em>Comment java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String comment_java_lang_String_ = COMMENT_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryLogsLogGroupArn_java_lang_String_() <em>Query Logs Log Group Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLogsLogGroupArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryLogsLogGroupArn_java_lang_String_() <em>Query Logs Log Group Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLogsLogGroupArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String queryLogsLogGroupArn_java_lang_String_ = QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList() <em>Vpcs software amazon awscdk services ec2 IVpc As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList() <em>Vpcs software amazon awscdk services ec2 IVpc As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList()
	 * @generated
	 * @ordered
	 */
	protected String vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList = VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.route53.HostedZone";

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
	protected HostedZoneBuilder_route53Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.HOSTED_ZONE_BUILDER_ROUTE53;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZoneName_java_lang_String_() {
		return zoneName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZoneName_java_lang_String_(String newZoneName_java_lang_String_) {
		String oldZoneName_java_lang_String_ = zoneName_java_lang_String_;
		zoneName_java_lang_String_ = newZoneName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ZONE_NAME_JAVA_LANG_STRING_,
					oldZoneName_java_lang_String_, zoneName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment_java_lang_String_() {
		return comment_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment_java_lang_String_(String newComment_java_lang_String_) {
		String oldComment_java_lang_String_ = comment_java_lang_String_;
		comment_java_lang_String_ = newComment_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__COMMENT_JAVA_LANG_STRING_,
					oldComment_java_lang_String_, comment_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueryLogsLogGroupArn_java_lang_String_() {
		return queryLogsLogGroupArn_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryLogsLogGroupArn_java_lang_String_(String newQueryLogsLogGroupArn_java_lang_String_) {
		String oldQueryLogsLogGroupArn_java_lang_String_ = queryLogsLogGroupArn_java_lang_String_;
		queryLogsLogGroupArn_java_lang_String_ = newQueryLogsLogGroupArn_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING_,
					oldQueryLogsLogGroupArn_java_lang_String_, queryLogsLogGroupArn_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList() {
		return vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList(
			String newVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList) {
		String oldVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList = vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList;
		vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList = newVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST,
					oldVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList,
					vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList));
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
					AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ZONE_NAME_JAVA_LANG_STRING_:
			return getZoneName_java_lang_String_();
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__COMMENT_JAVA_LANG_STRING_:
			return getComment_java_lang_String_();
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING_:
			return getQueryLogsLogGroupArn_java_lang_String_();
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST:
			return getVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList();
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ZONE_NAME_JAVA_LANG_STRING_:
			setZoneName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__COMMENT_JAVA_LANG_STRING_:
			setComment_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING_:
			setQueryLogsLogGroupArn_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST:
			setVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ZONE_NAME_JAVA_LANG_STRING_:
			setZoneName_java_lang_String_(ZONE_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__COMMENT_JAVA_LANG_STRING_:
			setComment_java_lang_String_(COMMENT_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING_:
			setQueryLogsLogGroupArn_java_lang_String_(QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST:
			setVpcs_software_amazon_awscdk_services_ec2_IVpc_AsList(
					VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ZONE_NAME_JAVA_LANG_STRING_:
			return ZONE_NAME_JAVA_LANG_STRING__EDEFAULT == null ? zoneName_java_lang_String_ != null
					: !ZONE_NAME_JAVA_LANG_STRING__EDEFAULT.equals(zoneName_java_lang_String_);
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__COMMENT_JAVA_LANG_STRING_:
			return COMMENT_JAVA_LANG_STRING__EDEFAULT == null ? comment_java_lang_String_ != null
					: !COMMENT_JAVA_LANG_STRING__EDEFAULT.equals(comment_java_lang_String_);
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING_:
			return QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING__EDEFAULT == null
					? queryLogsLogGroupArn_java_lang_String_ != null
					: !QUERY_LOGS_LOG_GROUP_ARN_JAVA_LANG_STRING__EDEFAULT
							.equals(queryLogsLogGroupArn_java_lang_String_);
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST:
			return VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST_EDEFAULT == null
					? vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList != null
					: !VPCS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_LIST_EDEFAULT
							.equals(vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList);
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.HOSTED_ZONE_BUILDER_ROUTE53__ADDITIONAL_CODE:
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
		result.append(" (zoneName_java_lang_String_: ");
		result.append(zoneName_java_lang_String_);
		result.append(", comment_java_lang_String_: ");
		result.append(comment_java_lang_String_);
		result.append(", queryLogsLogGroupArn_java_lang_String_: ");
		result.append(queryLogsLogGroupArn_java_lang_String_);
		result.append(", vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList: ");
		result.append(vpcs_software_amazon_awscdk_services_ec2_IVpc_AsList);
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

} //HostedZoneBuilder_route53Impl
