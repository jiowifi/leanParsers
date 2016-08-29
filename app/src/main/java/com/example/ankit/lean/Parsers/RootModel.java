import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String type;
	public CopyrightModel _copyright;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public CreatorModel _creator;
	public String privacy;
	public String state;
	public String organizer_description;
	public String code_of_conduct;
	public VersionModel _version;
	public String end_time;
	public String topic;
	public String name;
	public String organizer_name;
	public String start_time;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String logo;
	public String description;
	public String location_name;

	public RootModel(String background_image, String type, CopyrightModel copyright, String timezone, Call_for_papersModel call_for_papers, int id, CreatorModel creator, String privacy, String state, String organizer_description, String code_of_conduct, VersionModel version, String end_time, String topic, String name, String organizer_name, String start_time, String email, ArrayList<Social_linksModel> social_links, String schedule_published_on, String logo, String description, String location_name) {

		this.background_image = background_image;
		this.type = type;
		this._copyright = copyright;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this._creator = creator;
		this.privacy = privacy;
		this.state = state;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.end_time = end_time;
		this.topic = topic;
		this.name = name;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.email = email;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.description = description;
		this.location_name = location_name;

	}

}