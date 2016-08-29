import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String organizer_name;
	public VersionModel _version;
	public String code_of_conduct;
	public String timezone;
	public String background_image;
	public String logo;
	public CopyrightModel _copyright;
	public String topic;
	public String state;
	public String privacy;
	public String start_time;
	public int id;
	public CreatorModel _creator;
	public String email;
	public String schedule_published_on;
	public String name;
	public String location_name;

	public RootModel(String organizer_description, ArrayList<Social_linksModel> social_links, String description, String end_time, Call_for_papersModel call_for_papers, String type, String organizer_name, VersionModel version, String code_of_conduct, String timezone, String background_image, String logo, CopyrightModel copyright, String topic, String state, String privacy, String start_time, int id, CreatorModel creator, String email, String schedule_published_on, String name, String location_name) {

		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.description = description;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.organizer_name = organizer_name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.background_image = background_image;
		this.logo = logo;
		this._copyright = copyright;
		this.topic = topic;
		this.state = state;
		this.privacy = privacy;
		this.start_time = start_time;
		this.id = id;
		this._creator = creator;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.location_name = location_name;

	}

}