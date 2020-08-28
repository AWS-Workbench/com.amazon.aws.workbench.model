/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SqlServerExInstanceEnginePropsBuilder_rds;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql Server Ex Instance Engine Props Builder rds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SqlServerExInstanceEnginePropsBuilder_rdsImpl#getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference <em>Version With Sql Server Engine Version software amazon awscdk services rds Sql Server Engine Version As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SqlServerExInstanceEnginePropsBuilder_rdsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SqlServerExInstanceEnginePropsBuilder_rdsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SqlServerExInstanceEnginePropsBuilder_rdsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SqlServerExInstanceEnginePropsBuilder_rdsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqlServerExInstanceEnginePropsBuilder_rdsImpl extends ServiceResourcesImpl
		implements SqlServerExInstanceEnginePropsBuilder_rds {
	/**
	 * The default value of the '{@link #getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference() <em>Version With Sql Server Engine Version software amazon awscdk services rds Sql Server Engine Version As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference() <em>Version With Sql Server Engine Version software amazon awscdk services rds Sql Server Engine Version As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference = VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps";

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
	protected SqlServerExInstanceEnginePropsBuilder_rdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference() {
		return versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference(
			String newVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference) {
		String oldVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference = versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference;
		versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference = newVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE,
					oldVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference,
					versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference));
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
					AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VAR_NAME, oldVarName,
					varName));
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
					AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__IDENTIFIER, oldIdentifier,
					identifier));
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
					AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE:
			return getVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference();
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE:
			setVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE:
			setVersionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference(
					VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE:
			return VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE_EDEFAULT == null
					? versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference != null
					: !VERSION_WITH_SQL_SERVER_ENGINE_VERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_RDS_SQL_SERVER_ENGINE_VERSION_AS_REFERENCE_EDEFAULT
							.equals(versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference);
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.SQL_SERVER_EX_INSTANCE_ENGINE_PROPS_BUILDER_RDS__ADDITIONAL_CODE:
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
				" (versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference: ");
		result.append(
				versionWithSqlServerEngineVersion_software_amazon_awscdk_services_rds_SqlServerEngineVersion_AsReference);
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

} //SqlServerExInstanceEnginePropsBuilder_rdsImpl
