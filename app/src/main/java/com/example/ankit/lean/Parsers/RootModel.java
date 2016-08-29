import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String description;
	public String end_time;
	public String state;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String timezone;
	public String privacy;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String email;
	public String name;
	public String type;
	public String logo;
	public String code_of_conduct;
	public String topic;
	public VersionModel _version;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String start_time;

	public RootModel(String location_name, String description, String end_time, String state, String organizer_name, CopyrightModel copyright, String schedule_published_on, String timezone, String privacy, int id, Call_for_papersModel call_for_papers, String organizer_description, String email, String name, String type, String logo, String code_of_conduct, String topic, VersionModel version, String background_image, ArrayList<Social_linksModel> social_links, CreatorModel creator, String start_time) {

		this.location_name = location_name;
		this.description = description;
		this.end_time = end_time;
		this.state = state;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.privacy = privacy;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.email = email;
		this.name = name;
		this.type = type;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._version = version;
		this.background_image = background_image;
		this.social_links = social_links;
		this._creator = creator;
		this.start_time = start_time;

	}

}