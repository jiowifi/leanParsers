import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String type;
	public String start_time;
	public String code_of_conduct;
	public String background_image;
	public CreatorModel _creator;
	public String email;
	public String description;
	public String schedule_published_on;
	public int id;
	public CopyrightModel _copyright;
	public String name;
	public String logo;
	public String organizer_name;
	public String privacy;
	public String end_time;
	public String organizer_description;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String location_name;
	public String timezone;

	public RootModel(ArrayList<Social_linksModel> social_links, VersionModel version, String type, String start_time, String code_of_conduct, String background_image, CreatorModel creator, String email, String description, String schedule_published_on, int id, CopyrightModel copyright, String name, String logo, String organizer_name, String privacy, String end_time, String organizer_description, String state, Call_for_papersModel call_for_papers, String topic, String location_name, String timezone) {

		this.social_links = social_links;
		this._version = version;
		this.type = type;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._creator = creator;
		this.email = email;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._copyright = copyright;
		this.name = name;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.location_name = location_name;
		this.timezone = timezone;

	}

}