package io.lockstep.api;


/// <summary>
/// The different depths of describing an account. See the Financial Account Model for possible values for each depth
/// </summary>
public class ReportDepth
{
    /// <summary>
    /// the classification of the account
    /// </summary>
    public int Classification = 0;
    
    /// <summary>
    /// the category of the account
    /// </summary>
    public int Category = 1;
    
    /// <summary>
    /// the subcategory of the account
    /// </summary>
    public int Subcategory = 2;
    
    /// <summary>
    /// the account
    /// </summary>
    public int Account = 3;
}
