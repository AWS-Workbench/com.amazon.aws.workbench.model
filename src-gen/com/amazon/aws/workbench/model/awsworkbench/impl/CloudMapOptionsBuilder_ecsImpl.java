/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.DnsRecordType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Map Options Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapOptionsBuilder_ecsImpl#getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference <em>Cloud Map Namespace With INamespace software amazon awscdk services servicediscovery INamespace As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapOptionsBuilder_ecsImpl#getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_ <em>Dns Record Type software amazon awscdk services servicediscovery Dns Record Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapOptionsBuilder_ecsImpl#getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Dns Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapOptionsBuilder_ecsImpl#getFailureThreshold_java_lang_Number_ <em>Failure Threshold java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapOptionsBuilder_ecsImpl#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapOptionsBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapOptionsBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapOptionsBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudMapOptionsBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudMapOptionsBuilder_ecsImpl extends ServiceResourcesImpl implements CloudMapOptionsBuilder_ecs {
	/**
	 * The default value of the '{@link #getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference() <em>Cloud Map Namespace With INamespace software amazon awscdk services servicediscovery INamespace As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference() <em>Cloud Map Namespace With INamespace software amazon awscdk services servicediscovery INamespace As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference = CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_() <em>Dns Record Type software amazon awscdk services servicediscovery Dns Record Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_()
	 * @generated
	 * @ordered
	 */
	protected static final DnsRecordType DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE__EDEFAULT = DnsRecordType.A;

	/**
	 * The cached value of the '{@link #getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_() <em>Dns Record Type software amazon awscdk services servicediscovery Dns Record Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_()
	 * @generated
	 * @ordered
	 */
	protected DnsRecordType dnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_ = DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Dns Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Dns Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureThreshold_java_lang_Number_() <em>Failure Threshold java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureThreshold_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int FAILURE_THRESHOLD_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFailureThreshold_java_lang_Number_() <em>Failure Threshold java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureThreshold_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int failureThreshold_java_lang_Number_ = FAILURE_THRESHOLD_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getName_java_lang_String_() <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_java_lang_String_() <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String name_java_lang_String_ = NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.CloudMapOptions";

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
	protected CloudMapOptionsBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.CLOUD_MAP_OPTIONS_BUILDER_ECS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference() {
		return cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference(
			String newCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference) {
		String oldCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference = cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference;
		cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference = newCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE,
					oldCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference,
					cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DnsRecordType getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_() {
		return dnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_(
			DnsRecordType newDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_) {
		DnsRecordType oldDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_ = dnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_;
		dnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_ = newDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_ == null
				? DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE__EDEFAULT
				: newDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE_,
					oldDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_,
					dnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference = newDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFailureThreshold_java_lang_Number_() {
		return failureThreshold_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureThreshold_java_lang_Number_(int newFailureThreshold_java_lang_Number_) {
		int oldFailureThreshold_java_lang_Number_ = failureThreshold_java_lang_Number_;
		failureThreshold_java_lang_Number_ = newFailureThreshold_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__FAILURE_THRESHOLD_JAVA_LANG_NUMBER_,
					oldFailureThreshold_java_lang_Number_, failureThreshold_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName_java_lang_String_() {
		return name_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName_java_lang_String_(String newName_java_lang_String_) {
		String oldName_java_lang_String_ = name_java_lang_String_;
		name_java_lang_String_ = newName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_,
					oldName_java_lang_String_, name_java_lang_String_));
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
					AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE:
			return getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference();
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE_:
			return getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_();
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__FAILURE_THRESHOLD_JAVA_LANG_NUMBER_:
			return getFailureThreshold_java_lang_Number_();
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			return getName_java_lang_String_();
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE:
			setCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE_:
			setDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_((DnsRecordType) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__FAILURE_THRESHOLD_JAVA_LANG_NUMBER_:
			setFailureThreshold_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE:
			setCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference(
					CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE_:
			setDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_(
					DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__FAILURE_THRESHOLD_JAVA_LANG_NUMBER_:
			setFailureThreshold_java_lang_Number_(FAILURE_THRESHOLD_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			setName_java_lang_String_(NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE:
			return CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE_EDEFAULT == null
					? cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference != null
					: !CLOUD_MAP_NAMESPACE_WITH_INAMESPACE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_INAMESPACE_AS_REFERENCE_EDEFAULT
							.equals(cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference);
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE_:
			return dnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_ != DNS_RECORD_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_SERVICEDISCOVERY_DNS_RECORD_TYPE__EDEFAULT;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !DNS_TTL_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__FAILURE_THRESHOLD_JAVA_LANG_NUMBER_:
			return failureThreshold_java_lang_Number_ != FAILURE_THRESHOLD_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__NAME_JAVA_LANG_STRING_:
			return NAME_JAVA_LANG_STRING__EDEFAULT == null ? name_java_lang_String_ != null
					: !NAME_JAVA_LANG_STRING__EDEFAULT.equals(name_java_lang_String_);
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.CLOUD_MAP_OPTIONS_BUILDER_ECS__ADDITIONAL_CODE:
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
		result.append(
				" (cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference: ");
		result.append(
				cloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference);
		result.append(", dnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_: ");
		result.append(dnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_);
		result.append(", dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(dnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", failureThreshold_java_lang_Number_: ");
		result.append(failureThreshold_java_lang_Number_);
		result.append(", name_java_lang_String_: ");
		result.append(name_java_lang_String_);
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

} //CloudMapOptionsBuilder_ecsImpl
