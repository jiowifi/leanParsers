import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String location_name;
	public String code_of_conduct;
	public String timezone;
	public String state;
	public String topic;
	public CopyrightModel _copyright;
	public String name;
	public String schedule_published_on;
	public String start_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String end_time;
	public String type;
	public String organizer_description;
	public String description;
	public String background_image;
	public String email;
	public String organizer_name;

	public RootModel(VersionModel version, String privacy, Call_for_papersModel call_for_papers, CreatorModel creator, String location_name, String code_of_conduct, String timezone, String state, String topic, CopyrightModel copyright, String name, String schedule_published_on, String start_time, int id, ArrayList<Social_linksModel> social_links, String logo, String end_time, String type, String organizer_description, String description, String background_image, String email, String organizer_name) {

		this._version = version;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.state = state;
		this.topic = topic;
		this._copyright = copyright;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.id = id;
		this.social_links = social_links;
		this.logo = logo;
		this.end_time = end_time;
		this.type = type;
		this.organizer_description = organizer_description;
		this.description = description;
		this.background_image = background_image;
		this.email = email;
		this.organizer_name = organizer_name;

	}

}