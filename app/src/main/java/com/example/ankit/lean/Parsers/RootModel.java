import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String type;
	public String schedule_published_on;
	public String logo;
	public String topic;
	public String location_name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String email;
	public String end_time;
	public String privacy;
	public String start_time;
	public int id;
	public String code_of_conduct;
	public String name;
	public String description;
	public String state;
	public String background_image;

	public RootModel(CreatorModel creator, String type, String schedule_published_on, String logo, String topic, String location_name, String organizer_description, ArrayList<Social_linksModel> social_links, String timezone, String organizer_name, Call_for_papersModel call_for_papers, VersionModel version, CopyrightModel copyright, String email, String end_time, String privacy, String start_time, int id, String code_of_conduct, String name, String description, String state, String background_image) {

		this._creator = creator;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.topic = topic;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this._copyright = copyright;
		this.email = email;
		this.end_time = end_time;
		this.privacy = privacy;
		this.start_time = start_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.description = description;
		this.state = state;
		this.background_image = background_image;

	}

}