import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String email;
	public String end_time;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String topic;
	public VersionModel _version;
	public String schedule_published_on;
	public String location_name;
	public String organizer_description;
	public String logo;
	public String start_time;
	public String privacy;
	public String name;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String type;
	public CopyrightModel _copyright;
	public String state;
	public String background_image;
	public String description;

	public RootModel(CreatorModel creator, String email, String end_time, int id, Call_for_papersModel call_for_papers, String organizer_name, String topic, VersionModel version, String schedule_published_on, String location_name, String organizer_description, String logo, String start_time, String privacy, String name, String code_of_conduct, ArrayList<Social_linksModel> social_links, String timezone, String type, CopyrightModel copyright, String state, String background_image, String description) {

		this._creator = creator;
		this.email = email;
		this.end_time = end_time;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.start_time = start_time;
		this.privacy = privacy;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.timezone = timezone;
		this.type = type;
		this._copyright = copyright;
		this.state = state;
		this.background_image = background_image;
		this.description = description;

	}

}