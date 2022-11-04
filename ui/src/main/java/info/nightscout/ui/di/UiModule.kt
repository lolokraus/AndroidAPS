package info.nightscout.ui.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import info.nightscout.ui.activities.BolusProgressHelperActivity
import info.nightscout.ui.activities.ErrorHelperActivity
import info.nightscout.ui.activities.StatsActivity
import info.nightscout.ui.activities.SurveyActivity
import info.nightscout.ui.activities.TDDStatsActivity
import info.nightscout.ui.dialogs.CalibrationDialog
import info.nightscout.ui.dialogs.CarbsDialog
import info.nightscout.ui.dialogs.CareDialog

@Module
@Suppress("unused")
abstract class UiModule {

    @ContributesAndroidInjector abstract fun contributesCalibrationDialog(): CalibrationDialog
    @ContributesAndroidInjector abstract fun contributesCarbsDialog(): CarbsDialog
    @ContributesAndroidInjector abstract fun contributesCareDialog(): CareDialog

    @ContributesAndroidInjector abstract fun contributesTDDStatsActivity(): TDDStatsActivity
    @ContributesAndroidInjector abstract fun contributeBolusProgressHelperActivity(): BolusProgressHelperActivity
    @ContributesAndroidInjector abstract fun contributeErrorHelperActivity(): ErrorHelperActivity
    @ContributesAndroidInjector abstract fun contributesStatsActivity(): StatsActivity
    @ContributesAndroidInjector abstract fun contributesSurveyActivity(): SurveyActivity

}