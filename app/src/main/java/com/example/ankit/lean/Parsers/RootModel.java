import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String email;
	public String description;
	public String organizer_name;
	public String state;
	public String name;
	public String privacy;
	public String background_image;
	public String type;
	public String logo;
	public String schedule_published_on;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public int id;
	public String topic;
	public String end_time;
	public VersionModel _version;
	public String start_time;
	public CreatorModel _creator;
	public String code_of_conduct;

	public RootModel(CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String organizer_description, String email, String description, String organizer_name, String state, String name, String privacy, String background_image, String type, String logo, String schedule_published_on, String timezone, Call_for_papersModel call_for_papers, String location_name, int id, String topic, String end_time, VersionModel version, String start_time, CreatorModel creator, String code_of_conduct) {

		this._copyright = copyright;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.email = email;
		this.description = description;
		this.organizer_name = organizer_name;
		this.state = state;
		this.name = name;
		this.privacy = privacy;
		this.background_image = background_image;
		this.type = type;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.id = id;
		this.topic = topic;
		this.end_time = end_time;
		this._version = version;
		this.start_time = start_time;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;

	}

}