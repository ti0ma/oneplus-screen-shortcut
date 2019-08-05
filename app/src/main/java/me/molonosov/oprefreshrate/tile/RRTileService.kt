package me.molonosov.oprefreshrate.tile;

import android.service.quicksettings.Tile
import android.service.quicksettings.TileService
import me.molonosov.oprefreshrate.service.RefreshRateService

class RRTileService: TileService {
    private var refreshRateService: RefreshRateService? = null

    constructor(): super() {
        this.refreshRateService = RefreshRateService()
    }

    override fun onClick() {
        super.onClick()

        this.setState(Tile.STATE_UNAVAILABLE)
        this.refreshRateService?.toggleStatus()

        Thread.sleep(1_000)

        this.updateState()
    }

    override fun onStartListening() {
        super.onStartListening()

        this.updateState()
    }

    private fun setState(state: Int) {
        var tile = qsTile

        tile.state = state
        tile.label = "$state Hz"
        tile.updateTile()
    }

    private fun updateState() {
        var rateStatus = this.refreshRateService?.getStatus()

        if (rateStatus == "2") {
            return this.setState(Tile.STATE_ACTIVE)
        }
        return this.setState(Tile.STATE_INACTIVE)
    }
}
