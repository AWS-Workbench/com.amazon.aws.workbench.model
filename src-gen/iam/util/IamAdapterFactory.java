/**
 */
package iam.util;

import iam.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iam.IamPackage
 * @generated
 */
public class IamAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IamPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IamAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IamPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IamSwitch<Adapter> modelSwitch = new IamSwitch<Adapter>() {
		@Override
		public Adapter caseRolePropsBuilder_iam(RolePropsBuilder_iam object) {
			return createRolePropsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseUnknownPrincipalPropsBuilder_iam(UnknownPrincipalPropsBuilder_iam object) {
			return createUnknownPrincipalPropsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseOpenIdConnectProviderPropsBuilder_iam(OpenIdConnectProviderPropsBuilder_iam object) {
			return createOpenIdConnectProviderPropsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseGroupPropsBuilder_iam(GroupPropsBuilder_iam object) {
			return createGroupPropsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseRoleBuilder_iam(RoleBuilder_iam object) {
			return createRoleBuilder_iamAdapter();
		}

		@Override
		public Adapter caseServicePrincipalBuilder_iam(ServicePrincipalBuilder_iam object) {
			return createServicePrincipalBuilder_iamAdapter();
		}

		@Override
		public Adapter caseGrantOnPrincipalOptionsBuilder_iam(GrantOnPrincipalOptionsBuilder_iam object) {
			return createGrantOnPrincipalOptionsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseUserBuilder_iam(UserBuilder_iam object) {
			return createUserBuilder_iamAdapter();
		}

		@Override
		public Adapter caseGrantOnPrincipalAndResourceOptionsBuilder_iam(
				GrantOnPrincipalAndResourceOptionsBuilder_iam object) {
			return createGrantOnPrincipalAndResourceOptionsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseManagedPolicyBuilder_iam(ManagedPolicyBuilder_iam object) {
			return createManagedPolicyBuilder_iamAdapter();
		}

		@Override
		public Adapter caseFromRoleArnOptionsBuilder_iam(FromRoleArnOptionsBuilder_iam object) {
			return createFromRoleArnOptionsBuilder_iamAdapter();
		}

		@Override
		public Adapter casePolicyDocumentBuilder_iam(PolicyDocumentBuilder_iam object) {
			return createPolicyDocumentBuilder_iamAdapter();
		}

		@Override
		public Adapter casePolicyBuilder_iam(PolicyBuilder_iam object) {
			return createPolicyBuilder_iamAdapter();
		}

		@Override
		public Adapter casePolicyDocumentPropsBuilder_iam(PolicyDocumentPropsBuilder_iam object) {
			return createPolicyDocumentPropsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseUserPropsBuilder_iam(UserPropsBuilder_iam object) {
			return createUserPropsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseAddToResourcePolicyResultBuilder_iam(AddToResourcePolicyResultBuilder_iam object) {
			return createAddToResourcePolicyResultBuilder_iamAdapter();
		}

		@Override
		public Adapter casePolicyStatementPropsBuilder_iam(PolicyStatementPropsBuilder_iam object) {
			return createPolicyStatementPropsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseAddToPrincipalPolicyResultBuilder_iam(AddToPrincipalPolicyResultBuilder_iam object) {
			return createAddToPrincipalPolicyResultBuilder_iamAdapter();
		}

		@Override
		public Adapter casePolicyStatementBuilder_iam(PolicyStatementBuilder_iam object) {
			return createPolicyStatementBuilder_iamAdapter();
		}

		@Override
		public Adapter caseServicePrincipalOptsBuilder_iam(ServicePrincipalOptsBuilder_iam object) {
			return createServicePrincipalOptsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseUnknownPrincipalBuilder_iam(UnknownPrincipalBuilder_iam object) {
			return createUnknownPrincipalBuilder_iamAdapter();
		}

		@Override
		public Adapter caseManagedPolicyPropsBuilder_iam(ManagedPolicyPropsBuilder_iam object) {
			return createManagedPolicyPropsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseOpenIdConnectProviderBuilder_iam(OpenIdConnectProviderBuilder_iam object) {
			return createOpenIdConnectProviderBuilder_iamAdapter();
		}

		@Override
		public Adapter caseLazyRoleBuilder_iam(LazyRoleBuilder_iam object) {
			return createLazyRoleBuilder_iamAdapter();
		}

		@Override
		public Adapter caseCommonGrantOptionsBuilder_iam(CommonGrantOptionsBuilder_iam object) {
			return createCommonGrantOptionsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseGrantWithResourceOptionsBuilder_iam(GrantWithResourceOptionsBuilder_iam object) {
			return createGrantWithResourceOptionsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseLazyRolePropsBuilder_iam(LazyRolePropsBuilder_iam object) {
			return createLazyRolePropsBuilder_iamAdapter();
		}

		@Override
		public Adapter casePolicyPropsBuilder_iam(PolicyPropsBuilder_iam object) {
			return createPolicyPropsBuilder_iamAdapter();
		}

		@Override
		public Adapter caseGroupBuilder_iam(GroupBuilder_iam object) {
			return createGroupBuilder_iamAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.RolePropsBuilder_iam <em>Role Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.RolePropsBuilder_iam
	 * @generated
	 */
	public Adapter createRolePropsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.UnknownPrincipalPropsBuilder_iam <em>Unknown Principal Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.UnknownPrincipalPropsBuilder_iam
	 * @generated
	 */
	public Adapter createUnknownPrincipalPropsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.OpenIdConnectProviderPropsBuilder_iam <em>Open Id Connect Provider Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.OpenIdConnectProviderPropsBuilder_iam
	 * @generated
	 */
	public Adapter createOpenIdConnectProviderPropsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.GroupPropsBuilder_iam <em>Group Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.GroupPropsBuilder_iam
	 * @generated
	 */
	public Adapter createGroupPropsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.RoleBuilder_iam <em>Role Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.RoleBuilder_iam
	 * @generated
	 */
	public Adapter createRoleBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.ServicePrincipalBuilder_iam <em>Service Principal Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.ServicePrincipalBuilder_iam
	 * @generated
	 */
	public Adapter createServicePrincipalBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.GrantOnPrincipalOptionsBuilder_iam <em>Grant On Principal Options Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.GrantOnPrincipalOptionsBuilder_iam
	 * @generated
	 */
	public Adapter createGrantOnPrincipalOptionsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.UserBuilder_iam <em>User Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.UserBuilder_iam
	 * @generated
	 */
	public Adapter createUserBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.GrantOnPrincipalAndResourceOptionsBuilder_iam <em>Grant On Principal And Resource Options Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.GrantOnPrincipalAndResourceOptionsBuilder_iam
	 * @generated
	 */
	public Adapter createGrantOnPrincipalAndResourceOptionsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.ManagedPolicyBuilder_iam <em>Managed Policy Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.ManagedPolicyBuilder_iam
	 * @generated
	 */
	public Adapter createManagedPolicyBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.FromRoleArnOptionsBuilder_iam <em>From Role Arn Options Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.FromRoleArnOptionsBuilder_iam
	 * @generated
	 */
	public Adapter createFromRoleArnOptionsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.PolicyDocumentBuilder_iam <em>Policy Document Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.PolicyDocumentBuilder_iam
	 * @generated
	 */
	public Adapter createPolicyDocumentBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.PolicyBuilder_iam <em>Policy Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.PolicyBuilder_iam
	 * @generated
	 */
	public Adapter createPolicyBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.PolicyDocumentPropsBuilder_iam <em>Policy Document Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.PolicyDocumentPropsBuilder_iam
	 * @generated
	 */
	public Adapter createPolicyDocumentPropsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.UserPropsBuilder_iam <em>User Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.UserPropsBuilder_iam
	 * @generated
	 */
	public Adapter createUserPropsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.AddToResourcePolicyResultBuilder_iam <em>Add To Resource Policy Result Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.AddToResourcePolicyResultBuilder_iam
	 * @generated
	 */
	public Adapter createAddToResourcePolicyResultBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.PolicyStatementPropsBuilder_iam <em>Policy Statement Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.PolicyStatementPropsBuilder_iam
	 * @generated
	 */
	public Adapter createPolicyStatementPropsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.AddToPrincipalPolicyResultBuilder_iam <em>Add To Principal Policy Result Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.AddToPrincipalPolicyResultBuilder_iam
	 * @generated
	 */
	public Adapter createAddToPrincipalPolicyResultBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.PolicyStatementBuilder_iam <em>Policy Statement Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.PolicyStatementBuilder_iam
	 * @generated
	 */
	public Adapter createPolicyStatementBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.ServicePrincipalOptsBuilder_iam <em>Service Principal Opts Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.ServicePrincipalOptsBuilder_iam
	 * @generated
	 */
	public Adapter createServicePrincipalOptsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.UnknownPrincipalBuilder_iam <em>Unknown Principal Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.UnknownPrincipalBuilder_iam
	 * @generated
	 */
	public Adapter createUnknownPrincipalBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.ManagedPolicyPropsBuilder_iam <em>Managed Policy Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.ManagedPolicyPropsBuilder_iam
	 * @generated
	 */
	public Adapter createManagedPolicyPropsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.OpenIdConnectProviderBuilder_iam <em>Open Id Connect Provider Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.OpenIdConnectProviderBuilder_iam
	 * @generated
	 */
	public Adapter createOpenIdConnectProviderBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.LazyRoleBuilder_iam <em>Lazy Role Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.LazyRoleBuilder_iam
	 * @generated
	 */
	public Adapter createLazyRoleBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.CommonGrantOptionsBuilder_iam <em>Common Grant Options Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.CommonGrantOptionsBuilder_iam
	 * @generated
	 */
	public Adapter createCommonGrantOptionsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.GrantWithResourceOptionsBuilder_iam <em>Grant With Resource Options Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.GrantWithResourceOptionsBuilder_iam
	 * @generated
	 */
	public Adapter createGrantWithResourceOptionsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.LazyRolePropsBuilder_iam <em>Lazy Role Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.LazyRolePropsBuilder_iam
	 * @generated
	 */
	public Adapter createLazyRolePropsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.PolicyPropsBuilder_iam <em>Policy Props Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.PolicyPropsBuilder_iam
	 * @generated
	 */
	public Adapter createPolicyPropsBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iam.GroupBuilder_iam <em>Group Builder iam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iam.GroupBuilder_iam
	 * @generated
	 */
	public Adapter createGroupBuilder_iamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IamAdapterFactory
