import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public VersionModel _version;
	public int id;
	public String code_of_conduct;
	public String type;
	public String background_image;
	public String topic;
	public String end_time;
	public String location_name;
	public String email;
	public String schedule_published_on;
	public String description;
	public CopyrightModel _copyright;
	public String timezone;
	public String organizer_name;
	public String privacy;
	public String organizer_description;
	public CreatorModel _creator;
	public String name;
	public String state;

	public RootModel(Call_for_papersModel call_for_papers, String start_time, ArrayList<Social_linksModel> social_links, String logo, VersionModel version, int id, String code_of_conduct, String type, String background_image, String topic, String end_time, String location_name, String email, String schedule_published_on, String description, CopyrightModel copyright, String timezone, String organizer_name, String privacy, String organizer_description, CreatorModel creator, String name, String state) {

		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.social_links = social_links;
		this.logo = logo;
		this._version = version;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.background_image = background_image;
		this.topic = topic;
		this.end_time = end_time;
		this.location_name = location_name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._copyright = copyright;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.name = name;
		this.state = state;

	}

}