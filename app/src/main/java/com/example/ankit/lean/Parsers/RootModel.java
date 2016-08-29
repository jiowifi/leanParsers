import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String type;
	public String location_name;
	public String timezone;
	public int id;
	public String start_time;
	public String name;
	public String logo;
	public String end_time;
	public String organizer_name;
	public String background_image;
	public CopyrightModel _copyright;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String code_of_conduct;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public VersionModel _version;
	public String email;
	public CreatorModel _creator;
	public String description;

	public RootModel(String privacy, String type, String location_name, String timezone, int id, String start_time, String name, String logo, String end_time, String organizer_name, String background_image, CopyrightModel copyright, String state, ArrayList<Social_linksModel> social_links, String topic, String code_of_conduct, String schedule_published_on, Call_for_papersModel call_for_papers, String organizer_description, VersionModel version, String email, CreatorModel creator, String description) {

		this.privacy = privacy;
		this.type = type;
		this.location_name = location_name;
		this.timezone = timezone;
		this.id = id;
		this.start_time = start_time;
		this.name = name;
		this.logo = logo;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._copyright = copyright;
		this.state = state;
		this.social_links = social_links;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this._version = version;
		this.email = email;
		this._creator = creator;
		this.description = description;

	}

}