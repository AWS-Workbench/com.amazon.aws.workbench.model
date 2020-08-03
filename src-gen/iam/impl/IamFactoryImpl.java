/**
 */
package iam.impl;

import iam.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IamFactoryImpl extends EFactoryImpl implements IamFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IamFactory init() {
		try {
			IamFactory theIamFactory = (IamFactory) EPackage.Registry.INSTANCE.getEFactory(IamPackage.eNS_URI);
			if (theIamFactory != null) {
				return theIamFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IamFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IamFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case IamPackage.ROLE_PROPS_BUILDER_IAM:
			return createRolePropsBuilder_iam();
		case IamPackage.UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM:
			return createUnknownPrincipalPropsBuilder_iam();
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM:
			return createOpenIdConnectProviderPropsBuilder_iam();
		case IamPackage.GROUP_PROPS_BUILDER_IAM:
			return createGroupPropsBuilder_iam();
		case IamPackage.ROLE_BUILDER_IAM:
			return createRoleBuilder_iam();
		case IamPackage.SERVICE_PRINCIPAL_BUILDER_IAM:
			return createServicePrincipalBuilder_iam();
		case IamPackage.GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM:
			return createGrantOnPrincipalOptionsBuilder_iam();
		case IamPackage.USER_BUILDER_IAM:
			return createUserBuilder_iam();
		case IamPackage.GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM:
			return createGrantOnPrincipalAndResourceOptionsBuilder_iam();
		case IamPackage.MANAGED_POLICY_BUILDER_IAM:
			return createManagedPolicyBuilder_iam();
		case IamPackage.FROM_ROLE_ARN_OPTIONS_BUILDER_IAM:
			return createFromRoleArnOptionsBuilder_iam();
		case IamPackage.POLICY_DOCUMENT_BUILDER_IAM:
			return createPolicyDocumentBuilder_iam();
		case IamPackage.POLICY_BUILDER_IAM:
			return createPolicyBuilder_iam();
		case IamPackage.POLICY_DOCUMENT_PROPS_BUILDER_IAM:
			return createPolicyDocumentPropsBuilder_iam();
		case IamPackage.USER_PROPS_BUILDER_IAM:
			return createUserPropsBuilder_iam();
		case IamPackage.ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM:
			return createAddToResourcePolicyResultBuilder_iam();
		case IamPackage.POLICY_STATEMENT_PROPS_BUILDER_IAM:
			return createPolicyStatementPropsBuilder_iam();
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM:
			return createAddToPrincipalPolicyResultBuilder_iam();
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM:
			return createPolicyStatementBuilder_iam();
		case IamPackage.SERVICE_PRINCIPAL_OPTS_BUILDER_IAM:
			return createServicePrincipalOptsBuilder_iam();
		case IamPackage.UNKNOWN_PRINCIPAL_BUILDER_IAM:
			return createUnknownPrincipalBuilder_iam();
		case IamPackage.MANAGED_POLICY_PROPS_BUILDER_IAM:
			return createManagedPolicyPropsBuilder_iam();
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM:
			return createOpenIdConnectProviderBuilder_iam();
		case IamPackage.LAZY_ROLE_BUILDER_IAM:
			return createLazyRoleBuilder_iam();
		case IamPackage.COMMON_GRANT_OPTIONS_BUILDER_IAM:
			return createCommonGrantOptionsBuilder_iam();
		case IamPackage.GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM:
			return createGrantWithResourceOptionsBuilder_iam();
		case IamPackage.LAZY_ROLE_PROPS_BUILDER_IAM:
			return createLazyRolePropsBuilder_iam();
		case IamPackage.POLICY_PROPS_BUILDER_IAM:
			return createPolicyPropsBuilder_iam();
		case IamPackage.GROUP_BUILDER_IAM:
			return createGroupBuilder_iam();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case IamPackage.EFFECT:
			return createEffectFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case IamPackage.EFFECT:
			return convertEffectToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RolePropsBuilder_iam createRolePropsBuilder_iam() {
		RolePropsBuilder_iamImpl rolePropsBuilder_iam = new RolePropsBuilder_iamImpl();
		return rolePropsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownPrincipalPropsBuilder_iam createUnknownPrincipalPropsBuilder_iam() {
		UnknownPrincipalPropsBuilder_iamImpl unknownPrincipalPropsBuilder_iam = new UnknownPrincipalPropsBuilder_iamImpl();
		return unknownPrincipalPropsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenIdConnectProviderPropsBuilder_iam createOpenIdConnectProviderPropsBuilder_iam() {
		OpenIdConnectProviderPropsBuilder_iamImpl openIdConnectProviderPropsBuilder_iam = new OpenIdConnectProviderPropsBuilder_iamImpl();
		return openIdConnectProviderPropsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupPropsBuilder_iam createGroupPropsBuilder_iam() {
		GroupPropsBuilder_iamImpl groupPropsBuilder_iam = new GroupPropsBuilder_iamImpl();
		return groupPropsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleBuilder_iam createRoleBuilder_iam() {
		RoleBuilder_iamImpl roleBuilder_iam = new RoleBuilder_iamImpl();
		return roleBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicePrincipalBuilder_iam createServicePrincipalBuilder_iam() {
		ServicePrincipalBuilder_iamImpl servicePrincipalBuilder_iam = new ServicePrincipalBuilder_iamImpl();
		return servicePrincipalBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrantOnPrincipalOptionsBuilder_iam createGrantOnPrincipalOptionsBuilder_iam() {
		GrantOnPrincipalOptionsBuilder_iamImpl grantOnPrincipalOptionsBuilder_iam = new GrantOnPrincipalOptionsBuilder_iamImpl();
		return grantOnPrincipalOptionsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserBuilder_iam createUserBuilder_iam() {
		UserBuilder_iamImpl userBuilder_iam = new UserBuilder_iamImpl();
		return userBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrantOnPrincipalAndResourceOptionsBuilder_iam createGrantOnPrincipalAndResourceOptionsBuilder_iam() {
		GrantOnPrincipalAndResourceOptionsBuilder_iamImpl grantOnPrincipalAndResourceOptionsBuilder_iam = new GrantOnPrincipalAndResourceOptionsBuilder_iamImpl();
		return grantOnPrincipalAndResourceOptionsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManagedPolicyBuilder_iam createManagedPolicyBuilder_iam() {
		ManagedPolicyBuilder_iamImpl managedPolicyBuilder_iam = new ManagedPolicyBuilder_iamImpl();
		return managedPolicyBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromRoleArnOptionsBuilder_iam createFromRoleArnOptionsBuilder_iam() {
		FromRoleArnOptionsBuilder_iamImpl fromRoleArnOptionsBuilder_iam = new FromRoleArnOptionsBuilder_iamImpl();
		return fromRoleArnOptionsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyDocumentBuilder_iam createPolicyDocumentBuilder_iam() {
		PolicyDocumentBuilder_iamImpl policyDocumentBuilder_iam = new PolicyDocumentBuilder_iamImpl();
		return policyDocumentBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyBuilder_iam createPolicyBuilder_iam() {
		PolicyBuilder_iamImpl policyBuilder_iam = new PolicyBuilder_iamImpl();
		return policyBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyDocumentPropsBuilder_iam createPolicyDocumentPropsBuilder_iam() {
		PolicyDocumentPropsBuilder_iamImpl policyDocumentPropsBuilder_iam = new PolicyDocumentPropsBuilder_iamImpl();
		return policyDocumentPropsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserPropsBuilder_iam createUserPropsBuilder_iam() {
		UserPropsBuilder_iamImpl userPropsBuilder_iam = new UserPropsBuilder_iamImpl();
		return userPropsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddToResourcePolicyResultBuilder_iam createAddToResourcePolicyResultBuilder_iam() {
		AddToResourcePolicyResultBuilder_iamImpl addToResourcePolicyResultBuilder_iam = new AddToResourcePolicyResultBuilder_iamImpl();
		return addToResourcePolicyResultBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyStatementPropsBuilder_iam createPolicyStatementPropsBuilder_iam() {
		PolicyStatementPropsBuilder_iamImpl policyStatementPropsBuilder_iam = new PolicyStatementPropsBuilder_iamImpl();
		return policyStatementPropsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddToPrincipalPolicyResultBuilder_iam createAddToPrincipalPolicyResultBuilder_iam() {
		AddToPrincipalPolicyResultBuilder_iamImpl addToPrincipalPolicyResultBuilder_iam = new AddToPrincipalPolicyResultBuilder_iamImpl();
		return addToPrincipalPolicyResultBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyStatementBuilder_iam createPolicyStatementBuilder_iam() {
		PolicyStatementBuilder_iamImpl policyStatementBuilder_iam = new PolicyStatementBuilder_iamImpl();
		return policyStatementBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicePrincipalOptsBuilder_iam createServicePrincipalOptsBuilder_iam() {
		ServicePrincipalOptsBuilder_iamImpl servicePrincipalOptsBuilder_iam = new ServicePrincipalOptsBuilder_iamImpl();
		return servicePrincipalOptsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownPrincipalBuilder_iam createUnknownPrincipalBuilder_iam() {
		UnknownPrincipalBuilder_iamImpl unknownPrincipalBuilder_iam = new UnknownPrincipalBuilder_iamImpl();
		return unknownPrincipalBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManagedPolicyPropsBuilder_iam createManagedPolicyPropsBuilder_iam() {
		ManagedPolicyPropsBuilder_iamImpl managedPolicyPropsBuilder_iam = new ManagedPolicyPropsBuilder_iamImpl();
		return managedPolicyPropsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenIdConnectProviderBuilder_iam createOpenIdConnectProviderBuilder_iam() {
		OpenIdConnectProviderBuilder_iamImpl openIdConnectProviderBuilder_iam = new OpenIdConnectProviderBuilder_iamImpl();
		return openIdConnectProviderBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LazyRoleBuilder_iam createLazyRoleBuilder_iam() {
		LazyRoleBuilder_iamImpl lazyRoleBuilder_iam = new LazyRoleBuilder_iamImpl();
		return lazyRoleBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonGrantOptionsBuilder_iam createCommonGrantOptionsBuilder_iam() {
		CommonGrantOptionsBuilder_iamImpl commonGrantOptionsBuilder_iam = new CommonGrantOptionsBuilder_iamImpl();
		return commonGrantOptionsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrantWithResourceOptionsBuilder_iam createGrantWithResourceOptionsBuilder_iam() {
		GrantWithResourceOptionsBuilder_iamImpl grantWithResourceOptionsBuilder_iam = new GrantWithResourceOptionsBuilder_iamImpl();
		return grantWithResourceOptionsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LazyRolePropsBuilder_iam createLazyRolePropsBuilder_iam() {
		LazyRolePropsBuilder_iamImpl lazyRolePropsBuilder_iam = new LazyRolePropsBuilder_iamImpl();
		return lazyRolePropsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyPropsBuilder_iam createPolicyPropsBuilder_iam() {
		PolicyPropsBuilder_iamImpl policyPropsBuilder_iam = new PolicyPropsBuilder_iamImpl();
		return policyPropsBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupBuilder_iam createGroupBuilder_iam() {
		GroupBuilder_iamImpl groupBuilder_iam = new GroupBuilder_iamImpl();
		return groupBuilder_iam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effect createEffectFromString(EDataType eDataType, String initialValue) {
		Effect result = Effect.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEffectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IamPackage getIamPackage() {
		return (IamPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IamPackage getPackage() {
		return IamPackage.eINSTANCE;
	}

} //IamFactoryImpl
