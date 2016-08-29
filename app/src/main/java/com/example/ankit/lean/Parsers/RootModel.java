import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String logo;
	public String schedule_published_on;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String end_time;
	public String timezone;
	public String state;
	public String privacy;
	public int id;
	public VersionModel _version;
	public String name;
	public String topic;
	public String background_image;
	public String email;
	public String code_of_conduct;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String type;
	public String organizer_description;
	public String organizer_name;

	public RootModel(CreatorModel creator, String logo, String schedule_published_on, String description, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String end_time, String timezone, String state, String privacy, int id, VersionModel version, String name, String topic, String background_image, String email, String code_of_conduct, String location_name, Call_for_papersModel call_for_papers, String start_time, String type, String organizer_description, String organizer_name) {

		this._creator = creator;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.social_links = social_links;
		this._copyright = copyright;
		this.end_time = end_time;
		this.timezone = timezone;
		this.state = state;
		this.privacy = privacy;
		this.id = id;
		this._version = version;
		this.name = name;
		this.topic = topic;
		this.background_image = background_image;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.type = type;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;

	}

}