import java.util.ArrayList;

class RootModel {

	public int id;
	public String type;
	public VersionModel _version;
	public String organizer_description;
	public String email;
	public String name;
	public String timezone;
	public String schedule_published_on;
	public String privacy;
	public String state;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String end_time;
	public String background_image;
	public String logo;
	public String code_of_conduct;
	public String organizer_name;
	public CreatorModel _creator;
	public String topic;
	public String location_name;

	public RootModel(int id, String type, VersionModel version, String organizer_description, String email, String name, String timezone, String schedule_published_on, String privacy, String state, String start_time, Call_for_papersModel call_for_papers, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String description, String end_time, String background_image, String logo, String code_of_conduct, String organizer_name, CreatorModel creator, String topic, String location_name) {

		this.id = id;
		this.type = type;
		this._version = version;
		this.organizer_description = organizer_description;
		this.email = email;
		this.name = name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.state = state;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.social_links = social_links;
		this.description = description;
		this.end_time = end_time;
		this.background_image = background_image;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.topic = topic;
		this.location_name = location_name;

	}

}