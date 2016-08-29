import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String organizer_description;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String location_name;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String privacy;
	public CreatorModel _creator;
	public int id;
	public String end_time;
	public String state;
	public String logo;
	public String description;
	public String topic;
	public VersionModel _version;
	public String name;
	public String schedule_published_on;
	public String timezone;
	public String background_image;
	public String email;

	public RootModel(String code_of_conduct, String organizer_description, String organizer_name, Call_for_papersModel call_for_papers, String start_time, String location_name, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String type, String privacy, CreatorModel creator, int id, String end_time, String state, String logo, String description, String topic, VersionModel version, String name, String schedule_published_on, String timezone, String background_image, String email) {

		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.location_name = location_name;
		this._copyright = copyright;
		this.social_links = social_links;
		this.type = type;
		this.privacy = privacy;
		this._creator = creator;
		this.id = id;
		this.end_time = end_time;
		this.state = state;
		this.logo = logo;
		this.description = description;
		this.topic = topic;
		this._version = version;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.background_image = background_image;
		this.email = email;

	}

}