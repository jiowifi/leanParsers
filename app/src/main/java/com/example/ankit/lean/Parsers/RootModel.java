import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String organizer_description;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String code_of_conduct;
	public int id;
	public String schedule_published_on;
	public String timezone;
	public VersionModel _version;
	public String background_image;
	public String logo;
	public String end_time;
	public CopyrightModel _copyright;
	public String description;
	public String organizer_name;
	public String email;
	public String privacy;
	public String location_name;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String type;

	public RootModel(CreatorModel creator, String organizer_description, String state, Call_for_papersModel call_for_papers, String start_time, String code_of_conduct, int id, String schedule_published_on, String timezone, VersionModel version, String background_image, String logo, String end_time, CopyrightModel copyright, String description, String organizer_name, String email, String privacy, String location_name, String name, ArrayList<Social_linksModel> social_links, String topic, String type) {

		this._creator = creator;
		this.organizer_description = organizer_description;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._version = version;
		this.background_image = background_image;
		this.logo = logo;
		this.end_time = end_time;
		this._copyright = copyright;
		this.description = description;
		this.organizer_name = organizer_name;
		this.email = email;
		this.privacy = privacy;
		this.location_name = location_name;
		this.name = name;
		this.social_links = social_links;
		this.topic = topic;
		this.type = type;

	}

}