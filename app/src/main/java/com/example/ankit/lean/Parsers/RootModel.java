import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String topic;
	public String start_time;
	public String location_name;
	public String name;
	public String logo;
	public VersionModel _version;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String state;
	public int id;
	public String background_image;
	public String type;
	public String organizer_description;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String email;
	public String code_of_conduct;
	public String privacy;
	public String timezone;
	public CopyrightModel _copyright;

	public RootModel(CreatorModel creator, String topic, String start_time, String location_name, String name, String logo, VersionModel version, String organizer_name, Call_for_papersModel call_for_papers, String description, String state, int id, String background_image, String type, String organizer_description, String schedule_published_on, ArrayList<Social_linksModel> social_links, String end_time, String email, String code_of_conduct, String privacy, String timezone, CopyrightModel copyright) {

		this._creator = creator;
		this.topic = topic;
		this.start_time = start_time;
		this.location_name = location_name;
		this.name = name;
		this.logo = logo;
		this._version = version;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.state = state;
		this.id = id;
		this.background_image = background_image;
		this.type = type;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.end_time = end_time;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.timezone = timezone;
		this._copyright = copyright;

	}

}