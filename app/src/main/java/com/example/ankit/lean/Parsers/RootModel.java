import java.util.ArrayList;

class RootModel {

	public String description;
	public String end_time;
	public String organizer_description;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String start_time;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String topic;
	public String code_of_conduct;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String privacy;
	public String organizer_name;
	public String background_image;
	public CreatorModel _creator;
	public String logo;
	public String schedule_published_on;
	public String location_name;
	public String name;
	public String email;

	public RootModel(String description, String end_time, String organizer_description, CopyrightModel copyright, VersionModel version, String start_time, String state, Call_for_papersModel call_for_papers, int id, String topic, String code_of_conduct, String timezone, ArrayList<Social_linksModel> social_links, String type, String privacy, String organizer_name, String background_image, CreatorModel creator, String logo, String schedule_published_on, String location_name, String name, String email) {

		this.description = description;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this._version = version;
		this.start_time = start_time;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.social_links = social_links;
		this.type = type;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._creator = creator;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.name = name;
		this.email = email;

	}

}